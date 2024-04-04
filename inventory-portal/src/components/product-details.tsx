import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";
import Image from "next/image";
import Link from "next/link";
import { Button } from "./ui/button";
import { Label } from "./ui/label";

async function ProductDetails({ product }: { product: inventory }) {
	const resp = await prisma.inventory_display_properties.findFirst({
		where: {
			item_code: product.item_code
		},
		select: {
			image_url: true
		}
	});
	return (
		<div className="flex justify-center">
			<div className="flex flex-col mt-5 gap-2 w-1/2 items-center">
				<Button variant="outline" asChild className=" w-full">
					<Link href={`/inventory/${product.item_code}/uploadImage`}>
						Edit Item Photo
					</Link>
				</Button>
				<Image
					src={
						resp?.image_url
							? resp.image_url
							: "/inventory_default.png"
					}
					alt="inventory"
					width={300}
					height={300}
					className="size-1/2 object-contain"
				/>
				<div className="w-full xl:w-3/4">
					<div className="border border-black" />
					<div className="flex items-center justify-between p-1 ">
						<p className="">{product.item_code}</p>
						<p className="">{product.bar_code}</p>
					</div>
				</div>

				<h2 className="font-bold flex-start">{product.description}</h2>

				<div className="grid gap-2">
					<div className="grid grid-cols-3 items-center gap-4">
						<Label>Size</Label>
						<h2>{product.size}</h2>
					</div>
					<div className="grid grid-cols-3 items-center gap-4">
						<Label>Selling Price</Label>
						<h2>${product.sales_price}</h2>
					</div>
				</div>
			</div>
		</div>
	);
}

export default ProductDetails;
