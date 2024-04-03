import { Filter, Search } from "lucide-react";
import React from "react";
import { Button } from "./ui/button";
import { Input } from "./ui/input";

function NavBar() {
	return (
		<div className="flex justify-between items-center p-5 shadow bg-[#111928]">
			<h2 className="text-2xl font-bold text-white">Catalog</h2>
			<div className="flex gap-5 items-center">
				<Input placeholder="Search Item" />
				<Button variant={"outline"}>
					<Filter className="cursor-pointer" />
				</Button>
			</div>
		</div>
	);
}

export default NavBar;
