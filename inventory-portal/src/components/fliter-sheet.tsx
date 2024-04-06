'use client';
import {
  Sheet,
  SheetClose,
  SheetContent,
  SheetDescription,
  SheetHeader,
  SheetTitle,
  SheetTrigger,
} from '@/components/ui/sheet';
import { InventorySortType } from '@/lib/definitions';
import { Filter } from 'lucide-react';
import { usePathname, useSearchParams } from 'next/navigation';
import { Button } from './ui/button';
import { Label } from './ui/label';
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from './ui/select';

import { zodResolver } from '@hookform/resolvers/zod';
import { useForm } from 'react-hook-form';
import { string, z } from 'zod';

import { Form, FormControl, FormField, FormItem, FormLabel } from '@/components/ui/form';
import { Checkbox } from './ui/checkbox';

const FormSchema = z.object({
  sort: string().optional(),
  availableItemsOnly: z.boolean().optional(),
  showInactiveItems: z.boolean().optional(),
});

export default function FilterSheet() {
  const pathname = usePathname();
  const searchParams = useSearchParams();
  const form = useForm<z.infer<typeof FormSchema>>({
    resolver: zodResolver(FormSchema),
    defaultValues: {
      sort: (searchParams.get('sort') as InventorySortType) || 'item_code-asc',
      availableItemsOnly: searchParams.has('availableItemsOnly') || false,
      showInactiveItems: searchParams.has('showInactiveItems') || false,
    },
  });

  function handleSubmit(data: z.infer<typeof FormSchema>) {
    const newSearchParams = new URLSearchParams(searchParams);

    if (data.sort) {
      newSearchParams.set('sort', data.sort);
    } else {
      newSearchParams.delete('sort');
    }

    if (data.availableItemsOnly) {
      newSearchParams.set('availableItemsOnly', 'true');
    } else {
      newSearchParams.delete('availableItemsOnly');
    }

    if (data.showInactiveItems) {
      newSearchParams.set('showInactiveItems', 'true');
    } else {
      newSearchParams.delete('showInactiveItems');
    }

    const updatedUrl = `${pathname}?${newSearchParams.toString()}`;
    window.location.href = updatedUrl;
  }

  return (
    <div>
      <Sheet>
        <SheetTrigger asChild>
          <Button variant="outline">
            <Filter className="cursor-pointer" />
          </Button>
        </SheetTrigger>
        <SheetContent>
          <SheetHeader>
            <SheetTitle>Configuration</SheetTitle>
            <SheetDescription>Configure the search and filter options</SheetDescription>
          </SheetHeader>
          <div className="mt-5 flex flex-col">
            <Form {...form}>
              <form onSubmit={form.handleSubmit(handleSubmit)}>
                <FormField
                  control={form.control}
                  name="sort"
                  render={({ field }) => (
                    <FormItem className="flex items-center justify-between gap-5">
                      <div>
                        <FormLabel htmlFor="sort" className="text-right">
                          Sorting
                        </FormLabel>
                      </div>
                      <div className="w-3/5">
                        <Select onValueChange={field.onChange} defaultValue={field.value}>
                          <FormControl>
                            <SelectTrigger>
                              <SelectValue placeholder="Select an option" />
                            </SelectTrigger>
                          </FormControl>
                          <SelectContent>
                            <SelectItem value="price-asc">Price - Low to High</SelectItem>
                            <SelectItem value="price-desc">Price - High to Low</SelectItem>
                            <SelectItem value="quantity-asc">Quantity - Low to High</SelectItem>
                            <SelectItem value="quantity-desc">Quantity - High to Low</SelectItem>
                            <SelectItem value="item_code-asc">Item Code - A to Z</SelectItem>
                            <SelectItem value="item_code-desc">Item Code - Z to A</SelectItem>
                          </SelectContent>
                        </Select>
                      </div>
                    </FormItem>
                  )}
                />
                <FormField
                  control={form.control}
                  name="availableItemsOnly"
                  render={({ field }) => (
                    <FormItem>
                      <FormControl>
                        <div className="mt-5 flex items-center justify-between">
                          <FormLabel
                            htmlFor="availableItemsOnly"
                            className="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                          >
                            Show In Stock Items Only
                          </FormLabel>
                          <Checkbox
                            id="availableItemsOnly"
                            checked={field.value}
                            onCheckedChange={field.onChange}
                          />
                        </div>
                      </FormControl>
                    </FormItem>
                  )}
                />
                <FormField
                  control={form.control}
                  name="showInactiveItems"
                  render={({ field }) => (
                    <FormItem>
                      <FormControl>
                        <div className="mt-5 flex items-center justify-between">
                          <FormLabel
                            htmlFor="showInactiveItems"
                            className="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
                          >
                            Show Inactive Items
                          </FormLabel>
                          <Checkbox
                            id="showInactiveItems"
                            checked={field.value}
                            onCheckedChange={field.onChange}
                          />
                        </div>
                      </FormControl>
                    </FormItem>
                  )}
                />

                <SheetClose asChild>
                  <Button type="submit" className="mt-5 w-full">
                    Apply
                  </Button>
                </SheetClose>
              </form>
            </Form>
          </div>
        </SheetContent>
      </Sheet>
    </div>
  );
}
