import InventoryList from '@/components/inventory-list';
import Pagination from '@/components/pagination';
import { InventoryListSkeleton, PaginationSkeleton } from '@/components/skeletons';
import { fetchInventoryTotal } from '@/lib/data';
import { InventorySortType } from '@/lib/definitions';
import { Suspense } from 'react';

export default async function Inventory({
  searchParams,
}: {
  searchParams?: {
    query?: string;
    page?: string;
    sort?: InventorySortType;
    availableItems?: boolean;
  };
}) {
  const query = searchParams?.query || '';
  const currentPage = Number(searchParams?.page) || 1;
  const sort = searchParams?.sort || 'item_code-asc';
  const availableItems = searchParams?.availableItems || false;
  const [totalPages, totalCount] = await fetchInventoryTotal(query, availableItems);

  return (
    <div className="h-[90%] min-h-[93vh] bg-gray-200">
      <div className="mx-5 flex flex-col gap-5">
        <div className="mt-2 flex justify-center">
          <Suspense fallback={<p>Loading...</p>}>
            <p className="text-lg">{totalCount} items found</p>
          </Suspense>
        </div>
        <div className="grow">
          <Suspense key={query + currentPage + sort} fallback={<InventoryListSkeleton />}>
            <InventoryList
              query={query}
              page={currentPage}
              sort={sort}
              availableItems={availableItems}
            />
          </Suspense>
        </div>
        <div className="mb-2 flex w-full justify-center self-end">
          <Suspense key={query + currentPage} fallback={<PaginationSkeleton />}>
            <Pagination totalPages={totalPages} />
          </Suspense>
        </div>
      </div>
    </div>
  );
}
