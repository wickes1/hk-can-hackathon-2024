import Search from "./search";
import FilterSheet from "./fliter-sheet";
import { Suspense } from "react";
import { FilterSheetSkeleton } from "./skeletons";

async function NavBar() {
	return (
		<div className="h-[10%] flex justify-between items-center px-5 py-3 shadow bg-slate-900">
			<h2 className="text-2xl font-bold text-white">Inventory Catalog</h2>
			<div className="flex gap-5 items-center">
				<Search placeholder="Search Item" />
				<Suspense fallback={<FilterSheetSkeleton />}>
					<FilterSheet />
				</Suspense>
			</div>
		</div>
	);
}

export default NavBar;
