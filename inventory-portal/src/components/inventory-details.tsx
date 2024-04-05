import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";
import Image from "next/image";
import Link from "next/link";
import { Button } from "./ui/button";
import { Label } from "./ui/label";

async function InventoryDetails({
	inventory: inventory
}: {
	inventory: inventory;
}) {
	const resp = await prisma.inventory_display_properties.findFirst({
		where: {
			item_code: inventory.item_code
		},
		select: {
			image_url: true
		}
	});
	return (
		<div className="flex w-[80%] lg:w-[55%] xl:w-[45%] h-[32rem] mx-auto justify-center overflow-auto mb-5">
			<div className="flex flex-col w-full mt-5 gap-2">
				<div className="flex flex-col gap-3 items-center">
					<Button variant="outline" asChild className="w-4/5">
						<Link
							href={`/inventory/${inventory.item_code}/uploadImage`}
						>
							Edit Item Photo
						</Link>
					</Button>
					{resp?.image_url ? (
						<>
							<Image
								src={resp.image_url}
								alt="inventory"
								width={100}
								height={100}
								className="w-56 h-56 object-contain"
							/>
						</>
					) : (
						<></>
					)}
				</div>

				<div className="w-full border border-black" />

				<div className="w-full">
					<div className="flex items-center justify-between p-1 ">
						<p className="">{inventory.item_code}</p>
						<p className="">{inventory.bar_code}</p>
					</div>
				</div>

				<h2 className="font-bold flex-start">
					{inventory.description}
				</h2>

				<div className="flex flex-col gap-2">
					<div className="flex justify-between items-center">
						<Label className="text-base">Size</Label>
						<p>{inventory.size}</p>
					</div>
					<div className="flex justify-between items-center">
						<Label>Selling Price</Label>
						<h2>${inventory.sales_price?.toString()}</h2>
					</div>
				</div>

				<div className="mt-2">
					<div className="flex flex-col items-center w-full">
						<p className="font-semibold mb-2">Inventory</p>

						<div className="flex flex-col border border-black rounded-lg mb-3 w-full">
							<div className="flex">
								<div className="font-semibold border-b border-[#DFE4EA] flex-1 flex break-all p-2">
									<p>Expiry Date</p>
								</div>
								<div className="font-semibold border-b border-[#DFE4EA] flex-1 flex break-all p-2 justify-end">
									<p>Quantity</p>
								</div>
							</div>
							<div className="flex">
								<div className="flex break-all p-2 flex-1">
									<p>{inventory.expiry_date}</p>
								</div>
								<div className="flex break-all p-2 flex-1 justify-end">
									<p>{inventory.quantity?.toString()}</p>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div className="flex justify-between items-center">
					<Label className="text-base">Last Sync</Label>
					<p>{inventory.update_date?.toISOString()}</p>
				</div>
			</div>
		</div>
	);
}

export default InventoryDetails;
