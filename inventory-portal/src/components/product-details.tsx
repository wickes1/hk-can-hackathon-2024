import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";
import Image from "next/image";
import Link from "next/link";
import { Button } from "./ui/button";

async function ProductDetails({ product }: { product: inventory }) {
	const image_url = await prisma.inventory_display_properties.findFirst({
		where: {
			item_code: product.item_code
		},
		select: {
			image_url: true
		}
	});
	return (
		<div className="flex flex-col items-center justify-center mt-5">
			<Button variant="outline" asChild className="w-1/4">
				<Link href={`/inventory/${product.item_code}/uploadImage`}>
					Edit Item Photo
				</Link>
			</Button>
			<div className="flex justify-center">
				<Image
					src={
						image_url
							? image_url.image_url
							: "/inventory_default.png"
					}
					alt="inventory"
					width={300}
					height={300}
					className="h-[300px] w-[300px] object-contain"
				/>
			</div>
			<hr className="h-px my-8 bg-black border-0" />
			<div className="flex items-center justify-between p-1">
				<p className="text-gray-400">{product.item_code}</p>
				<p className="text-gray-400">{product.bar_code}</p>
			</div>
		</div>
	);
}

export default ProductDetails;
