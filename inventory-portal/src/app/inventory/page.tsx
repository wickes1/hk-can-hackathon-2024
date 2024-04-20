import InventoryList from '@/components/inventory-list';
import Pagination from '@/components/pagination';
import { InventoryListSkeleton, PaginationSkeleton } from '@/components/skeletons';
import { fetchInventoryTotal, findFilteredInventory } from '@/lib/data';
import { InventorySortType } from '@/lib/definitions';
import { inventory } from '@prisma/client';
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
  const inventories: inventory[] = await findFilteredInventory(
    query,
    currentPage,
    sort,
    availableItemsOnly,
    showInactiveItems,
  );

  return (
    <div className="mx-5 flex flex-col gap-5">
      <div className="mt-2 flex justify-center">
        <Suspense fallback={<p>Loading...</p>}>
          <p className="text-lg">{totalCount} items found</p>
        </Suspense>
      </div>
      <div className="grow">
        <Suspense key={query + currentPage + sort} fallback={<InventoryListSkeleton />}>
          <InventoryList inventories={inventories} />
        </Suspense>
      </div>
      <div className="mb-2 flex w-full justify-center">
        <Suspense key={query + currentPage} fallback={<PaginationSkeleton />}>
          <Pagination totalPages={totalPages} />
        </Suspense>
      </div>
    </div>
  );
}
