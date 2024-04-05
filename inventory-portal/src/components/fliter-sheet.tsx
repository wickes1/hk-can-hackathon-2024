"use client";
import {
	Sheet,
	SheetClose,
	SheetContent,
	SheetDescription,
	SheetHeader,
	SheetTitle,
	SheetTrigger
} from "@/components/ui/sheet";
import { InventorySortType } from "@/lib/definitions";
import { Filter } from "lucide-react";
import { usePathname, useSearchParams } from "next/navigation";
import { Button } from "./ui/button";
import { Label } from "./ui/label";
import {
	Select,
	SelectContent,
	SelectItem,
	SelectTrigger,
	SelectValue
} from "./ui/select";

import { zodResolver } from "@hookform/resolvers/zod";
import { useForm } from "react-hook-form";
import { string, z } from "zod";

import {
	Form,
	FormControl,
	FormField,
	FormItem,
	FormLabel
} from "@/components/ui/form";
import { Checkbox } from "./ui/checkbox";

const FormSchema = z.object({
	sort: string().optional(),
	availableItems: z.boolean().optional()
});

export default function FilterSheet() {
	const pathname = usePathname();
	const searchParams = useSearchParams();
	const form = useForm<z.infer<typeof FormSchema>>({
		resolver: zodResolver(FormSchema),
		defaultValues: {
			sort:
				(searchParams.get("sort") as InventorySortType) ||
				"item_code-asc",
			availableItems: searchParams.has("availableItems") || false
		}
	});

	function handleSubmit(data: z.infer<typeof FormSchema>) {
		const sort = data.sort as InventorySortType;
		const newSearchParams = new URLSearchParams(searchParams);

		if (sort) {
			newSearchParams.set("sort", sort);
		} else {
			newSearchParams.delete("sort");
		}

		if (data.availableItems) {
			newSearchParams.set("availableItems", "true");
		} else {
			newSearchParams.delete("availableItems");
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
						<SheetDescription>
							Configure the search and filter options
						</SheetDescription>
					</SheetHeader>
					<div className="max-w-md w-full flex flex-col gap-4">
						<Form {...form}>
							<form onSubmit={form.handleSubmit(handleSubmit)}>
								<FormField
									control={form.control}
									name="sort"
									render={({ field }) => (
										<div>
											<FormItem>
												<div className="grid gap-4 py-4">
													<div className="grid grid-cols-4 items-center gap-4">
														<Label
															htmlFor="sort"
															className="text-right"
														>
															Sorting
														</Label>
														<Select
															onValueChange={
																field.onChange
															}
															defaultValue={
																field.value
															}
														>
															<FormControl>
																<SelectTrigger className="col-span-3">
																	<SelectValue placeholder="Select an option" />
																</SelectTrigger>
															</FormControl>
															<SelectContent>
																<SelectItem value="price-asc">
																	Price - Low
																	to High
																</SelectItem>
																<SelectItem value="price-desc">
																	Price - High
																	to Low
																</SelectItem>
																<SelectItem value="quantity-asc">
																	Quantity -
																	Low to High
																</SelectItem>
																<SelectItem value="quantity-desc">
																	Quantity -
																	High to Low
																</SelectItem>
																<SelectItem value="item_code-asc">
																	Item Code -
																	A to Z
																</SelectItem>
																<SelectItem value="item_code-desc">
																	Item Code -
																	Z to A
																</SelectItem>
															</SelectContent>
														</Select>
													</div>
												</div>
											</FormItem>
										</div>
									)}
								/>
								<FormField
									control={form.control}
									name="availableItems"
									render={({ field }) => (
										<div>
											<FormItem>
												<FormControl>
													<div className="grid gap-4 py-4">
														<div className="flex gap-3 items-center">
															<Checkbox
																id="availableItems"
																checked={
																	field.value
																}
																onCheckedChange={
																	field.onChange
																}
															/>
															<FormLabel
																htmlFor="availableItems"
																className="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
															>
																Show Available
																items only
															</FormLabel>
														</div>
													</div>
												</FormControl>
											</FormItem>
										</div>
									)}
								/>
								<SheetClose asChild>
									<Button
										type="submit"
										className="w-full mt-5"
									>
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
