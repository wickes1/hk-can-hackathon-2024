import { Drawer, DrawerContent, DrawerTrigger } from '@/components/ui/drawer';
import { findFilteredInventory } from '@/lib/data';
import { inventory } from '@prisma/client';
import InventoryCard from './inventory-card';
import InventoryDetails from './inventory-details';
import { InventorySortType } from '@/lib/definitions';

async function InventoryList({
  query,
  page,
  sort,
  availableItemsOnly,
  showInactiveItems,
}: {
  query: string;
  page: number;
  sort: InventorySortType;
  availableItemsOnly: boolean;
  showInactiveItems: boolean;
}) {
  const inventories: inventory[] = await findFilteredInventory(
    query,
    page,
    sort,
    availableItemsOnly,
    showInactiveItems,
  );

  return (
    <div
      className="grid
        grid-cols-2
        gap-10
        md:grid-cols-3
        lg:grid-cols-3
        xl:grid-cols-5
        "
    >
      {inventories.map((inventory) => (
        <Drawer key={inventory.item_code}>
          <DrawerTrigger>
            <InventoryCard inventory={inventory} />
          </DrawerTrigger>
          <DrawerContent>
            <InventoryDetails inventory={inventory} />
          </DrawerContent>
        </Drawer>
      ))}
    </div>
  );
}

export default InventoryList;
