import Search from "./search";
import FilterWidget from "./fliter-widget";

async function NavBar() {
  return (
    <div className="h-[10%] flex justify-between items-center px-5 py-3 shadow bg-slate-900">
      <h2 className="text-2xl font-bold text-white">Inventory Catalog</h2>
      <div className="flex gap-5 items-center">
        <Search placeholder="Search Item" />
        <FilterWidget />
      </div>
    </div>
  );
}

export default NavBar;
