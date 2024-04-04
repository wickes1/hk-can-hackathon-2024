import { Filter } from "lucide-react";
import { Button } from "./ui/button";
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
import { Label } from "./ui/label";
import { Input } from "./ui/input";
import {
	Select,
	SelectContent,
	SelectItem,
	SelectTrigger,
	SelectValue
} from "./ui/select";
import { Checkbox } from "./ui/checkbox";

export default async function FilterSheet() {
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
					<div className="grid gap-4 py-4">
						<div className="grid grid-cols-4 items-center gap-4">
							<Label htmlFor="sorting" className="text-right">
								Sorting
							</Label>
							<Select>
								<SelectTrigger className="col-span-3">
									<SelectValue placeholder="Select an option" />
								</SelectTrigger>
								<SelectContent>
									<SelectItem value="price-asc">
										Price - High to Low
									</SelectItem>
									<SelectItem value="price-desc">
										Price - Low to High
									</SelectItem>
								</SelectContent>
							</Select>
						</div>
					</div>
					<SheetFooter>
						<SheetClose asChild>
							<Button type="submit">Save changes</Button>
						</SheetClose>
					</SheetFooter>
				</SheetContent>
			</Sheet>
		</div>
	);
}
