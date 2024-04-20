import { Drawer, DrawerContent, DrawerTrigger } from '@/components/ui/drawer';
import { inventory } from '@prisma/client';
import InventoryCard from './inventory-card';
import InventoryDetails from './inventory-details';

async function InventoryList({ inventories }: { inventories: inventory[] }) {
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
