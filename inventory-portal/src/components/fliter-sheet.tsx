"use client";
import {
	Sheet,
	SheetClose,
	SheetContent,
	SheetDescription,
	SheetFooter,
	SheetHeader,
	SheetTitle,
	SheetTrigger
} from "@/components/ui/sheet";
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
import { InventorySortType } from "@/lib/definitions";

import Link from "next/link";
import { zodResolver } from "@hookform/resolvers/zod";
import { useForm } from "react-hook-form";
import { z } from "zod";

import {
	Form,
	FormControl,
	FormDescription,
	FormField,
	FormItem,
	FormLabel,
	FormMessage
} from "@/components/ui/form";
import { toast } from "./ui/use-toast";

const FormSchema = z.object({
	sort: z.string({
		required_error: "Please select a sorting option"
	})
});

export default function FilterSheet() {
	const pathname = usePathname();
	const searchParams = useSearchParams();
	const form = useForm<z.infer<typeof FormSchema>>({
		resolver: zodResolver(FormSchema)
	});

	function onSubmit(data: z.infer<typeof FormSchema>) {
		// on submit update the URL with the new sort value
		const sort = data.sort as InventorySortType;
		const newSearchParams = new URLSearchParams(searchParams);
		newSearchParams.set("sort", sort);
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
					<Form {...form}>
						<form onSubmit={form.handleSubmit(onSubmit)}>
							<FormField
								control={form.control}
								name="sort"
								render={({ field }) => (
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
													defaultValue={field.value}
												>
													<FormControl>
														<SelectTrigger className="col-span-3">
															<SelectValue placeholder="Select an option" />
														</SelectTrigger>
													</FormControl>
													<SelectContent>
														<SelectItem value="price-asc">
															Price - Low to High
														</SelectItem>
														<SelectItem value="price-desc">
															Price - High to Low
														</SelectItem>
														<SelectItem value="quantity-asc">
															Quantity - Low to
															High
														</SelectItem>
														<SelectItem value="quantity-desc">
															Quantity - High to
															Low
														</SelectItem>
													</SelectContent>
												</Select>
											</div>
										</div>
									</FormItem>
								)}
							/>
							<Button type="submit">Apply</Button>
						</form>
					</Form>
				</SheetContent>
			</Sheet>
		</div>
	);
}
