import {
	Popover,
	PopoverContent,
	PopoverTrigger
} from "@/components/ui/popover";
import { Button } from "./ui/button";
import { Filter } from "lucide-react";
import { Label } from "./ui/label";
import {
	Select,
	SelectContent,
	SelectItem,
	SelectTrigger,
	SelectValue
} from "./ui/select";
import { Checkbox } from "./ui/checkbox";

export default async function FilterWidget() {
	return (
		<Popover>
			<PopoverTrigger asChild>
				<Button variant={"outline"}>
					<Filter className="cursor-pointer" />
				</Button>
			</PopoverTrigger>

			<PopoverContent className="w-80">
				<div className="grid gap-4">
					<div className="grid grid-cols-3 items-center gap-4">
						<Label className="font-bold">Sorting</Label>
						<Select>
							<SelectTrigger className="w-[180px]">
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

					<div className="border" />

					<Label className="font-bold">Filter</Label>

					<div className="flex gap-3 items-center jc">
						<Checkbox id="terms" />
						<Label
							htmlFor="terms"
							className="text-sm font-medium leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70"
						>
							Show Available items only
						</Label>
					</div>
				</div>
			</PopoverContent>
		</Popover>
	);
}
