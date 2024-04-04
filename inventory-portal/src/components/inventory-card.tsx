import React from "react";
import { inventory } from "@prisma/client";
import Image from "next/image";
import prisma from "@/lib/prisma";

async function InventoryCard({ inventory: inventory }: { inventory: inventory }) {
	const resp = await prisma.inventory_display_properties.findFirst({
		where: {
			item_code: inventory.item_code
		},
		select: {
			image_url: true
		}
	});
	return (
		<div className="mt-2  p-2 rounded-lg  shadow-lg hover: transform hover:-translate-y-1 hover:scale-110 transition-all duration-200 ease-in-out cursor-pointer">
			<div className="flex justify-center">
				<Image
					src={resp?.image_url ? resp.image_url : "/inventory_default.png"}
					alt="inventory"
					width={300}
					height={300}
					className="h-[200px] w-[200px] object-cover"
				/>
			</div>
			<div className="flex justify-between p-1">
				<p className="truncate">{inventory.item_code}</p>
				<p className="truncate">{inventory.bar_code}</p>
			</div>
			<h2 className="text-lg mt-1 p-1 font-bold truncate hover:text-clip">
				{inventory.description}
			</h2>
			<div className="flex justify-between mt-1 p-1">
				<h2 className="font-bold truncate">${inventory.sales_price}</h2>
				<h2 className="font-bold truncate">QTY {inventory.quantity}</h2>
			</div>
		</div>
	);
}

export default InventoryCard;
