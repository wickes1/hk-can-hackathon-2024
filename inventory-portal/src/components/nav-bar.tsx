import Search from "./search";
import FilterSheet from "./fliter-sheet";

async function NavBar() {
	return (
		<div className="flex justify-between items-center p-5 shadow bg-[#111928]">
			<h2 className="text-2xl font-bold text-white">Catalog</h2>
			<div className="flex gap-5 items-center">
				<Search placeholder="Search Item" />
				<FilterSheet />
			</div>
		</div>
	);
}

export default NavBar;
