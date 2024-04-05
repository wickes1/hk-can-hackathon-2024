import React from "react";
import { inventory } from "@prisma/client";
import Image from "next/image";
import prisma from "@/lib/prisma";
import { CircleSlash, DollarSign, ScanBarcode, Warehouse } from "lucide-react";
import { Badge } from "@/components/ui/badge";

async function InventoryCard({ inventory: inventory }: { inventory: inventory }) {
    const resp = await prisma.inventory_display_properties.findFirst({
        where: {
            item_code: inventory.item_code,
        },
        select: {
            image_url: true,
        },
    });
    return (
        <div className="p-2 flex flex-col gap-2 bg-white rounded-lg  shadow-lg hover: transform hover:-translate-y-1 hover:scale-110 transition-all duration-200 ease-in-out cursor-pointer">
            <div className="h-4">{inventory.is_active ? <></> : <Badge variant="destructive">Inactive</Badge>}</div>

            <div className="flex justify-center">
                <Image src={resp?.image_url ? resp.image_url : "/inventory_default.png"} alt="inventory" width={300} height={300} className="h-40 w-40 object-contain" />
            </div>
            <div className="h-fit">
                <div className="flex flex-col gap-1 p-1 text-xs md:flex-row md:justify-between">
                    <div className="flex gap-0.5 items-center">
                        <CircleSlash size={16} />
                        <p>{inventory.item_code}</p>
                    </div>
                    <div className="flex gap-0.5 items-center">
                        <ScanBarcode size={16} />
                        <p className="truncate">{inventory.bar_code}</p>
                    </div>
                </div>
                <h2 className="text-lg mt-1 p-1 font-bold h-16 text-wrap line-clamp-2">{inventory.description}</h2>
                <div className="flex justify-between my-1 p-1 text-sm">
                    <div className="flex gap-0.5 items-center">
                        <DollarSign size={16} />
                        <p>{inventory.sales_price?.toString()}</p>
                    </div>
                    <div className="flex gap-0.5 items-center">
                        <Warehouse size={16} />
                        <p>{inventory.quantity?.toString()}</p>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default InventoryCard;
