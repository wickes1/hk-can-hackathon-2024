import prisma from '@/lib/prisma';
import { inventory } from '@prisma/client';
import Image from 'next/image';
import Link from 'next/link';
import { Button } from './ui/button';
import { Label } from './ui/label';
import { Badge } from '@/components/ui/badge';

async function InventoryDetails({ inventory: inventory }: { inventory: inventory }) {
  const resp = await prisma.inventory_display_properties.findFirst({
    where: {
      item_code: inventory.item_code,
    },
    select: {
      image_url: true,
    },
  });
  return (
    <div className="mx-auto mb-5 flex h-[32rem] w-[80%] justify-center overflow-auto lg:w-[55%] xl:w-[45%]">
      <div className="mt-5 flex w-full flex-col gap-2">
        <div className="flex flex-col items-center gap-3">
          <Button variant="outline" asChild className="w-4/5">
            <Link href={`/inventory/${inventory.item_code}/uploadImage`}>Edit Item Photo</Link>
          </Button>
          {resp?.image_url ? (
            <>
              <Image
                src={resp.image_url}
                alt="inventory"
                width={100}
                height={100}
                className="h-56 w-56 object-contain"
              />
            </>
          ) : (
            <></>
          )}
        </div>

        <div className="w-full border border-black" />

        <div className="w-full">
          {inventory.is_active ? (
            <></>
          ) : (
            <div>
              <Badge variant="destructive">Inactive</Badge>
            </div>
          )}
          <div className="flex items-center justify-between p-1 ">
            <p className="">{inventory.item_code}</p>
            <p className="">{inventory.bar_code}</p>
          </div>
        </div>

        <h2 className="flex-start font-bold">{inventory.description}</h2>

        <div className="flex flex-col gap-2">
          <div className="flex items-center justify-between">
            <Label className="text-base">Size</Label>
            <p>{inventory.size}</p>
          </div>
          <div className="flex items-center justify-between">
            <Label>Selling Price</Label>
            <h2>${inventory.sales_price?.toString()}</h2>
          </div>
        </div>

        <div className="mt-2">
          <div className="flex w-full flex-col items-center">
            <p className="mb-2 font-semibold">Inventory</p>

            <div className="mb-3 flex w-full flex-col rounded-lg border border-black">
              <div className="flex">
                <div className="flex flex-1 break-all border-b border-[#DFE4EA] p-2 font-semibold">
                  <p>Expiry Date</p>
                </div>
                <div className="flex flex-1 justify-end break-all border-b border-[#DFE4EA] p-2 font-semibold">
                  <p>Quantity</p>
                </div>
              </div>
              <div className="flex">
                <div className="flex flex-1 break-all p-2">
                  <p>{inventory.expiry_date}</p>
                </div>
                <div className="flex flex-1 justify-end break-all p-2">
                  <p>{inventory.quantity?.toString()}</p>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div className="flex items-center justify-between">
          <Label className="text-base">Last Sync</Label>
          <p>{inventory.update_date?.toLocaleString()}</p>
        </div>
      </div>
    </div>
  );
}

export default InventoryDetails;
