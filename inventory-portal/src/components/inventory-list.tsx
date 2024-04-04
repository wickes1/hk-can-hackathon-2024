import React from "react";
import { inventory } from "@prisma/client";
import InventoryCard from "./inventory-card";
import { Drawer, DrawerContent, DrawerTrigger } from "@/components/ui/drawer";
import InventoryDetails from "./inventory-details";
import { findFilteredInventory } from "@/lib/data";

async function InventoryList({ query, page }: { query: string; page: number }) {
	const inventories: inventory[] = await findFilteredInventory(query, page);

	return (
		<div
			className="grid
        grid-cols-1
        sm:grid-cols-2
        md:grid-cols-3
        lg:grid-cols-5
        gap-10 mt-5 mx-5
        "
		>
			{inventories.map(inventory => (
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
