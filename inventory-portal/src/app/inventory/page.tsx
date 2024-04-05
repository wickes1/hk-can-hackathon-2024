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
    availableItemsOnly?: boolean;
    showInactiveItems?: boolean;
  };
}) {
  const query = searchParams?.query || '';
  const currentPage = Number(searchParams?.page) || 1;
  const sort = searchParams?.sort || 'item_code-asc';
  const availableItemsOnly = searchParams?.availableItemsOnly || false;
  const showInactiveItems = searchParams?.showInactiveItems || false;
  const [totalPages, totalCount] = await fetchInventoryTotal(
    query,
    availableItemsOnly,
    showInactiveItems,
  );

  return (
    <div className="h-[90%] min-h-screen bg-gray-200">
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
              availableItemsOnly={availableItemsOnly}
              showInactiveItems={showInactiveItems}
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
