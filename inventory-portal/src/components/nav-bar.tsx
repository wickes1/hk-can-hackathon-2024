import Search from './search';
import FilterSheet from './fliter-sheet';
import { Suspense } from 'react';
import { FilterSheetSkeleton } from './skeletons';

async function NavBar() {
  return (
    <div className="flex h-[10%] items-center justify-between bg-slate-900 px-5 py-3 shadow">
      <h2 className="text-2xl font-bold text-white">Inventory Catalog</h2>
      <div className="flex items-center gap-5">
        <Suspense fallback={<div>Loading...</div>}>
          <Search placeholder="Search Item" />
        </Suspense>
        <Suspense fallback={<FilterSheetSkeleton />}>
          <FilterSheet />
        </Suspense>
      </div>
    </div>
  );
}

export default NavBar;
