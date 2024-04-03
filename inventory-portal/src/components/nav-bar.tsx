import { Filter, Search } from "lucide-react";
import React from "react";

function NavBar() {
	return (
		<div className="flex justify-between p-5 shadow bg-[#4166ab]">
			<h2 className="text-lg font-bold">Product Catalog</h2>
			<div className="flex gap-5 items-center">
				<Search className="cursor-pointer" />
				<Filter className="cursor-pointer" />
			</div>
		</div>
	);
}

export default NavBar;
