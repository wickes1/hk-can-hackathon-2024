import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";
import Image from "next/image";
import React from "react";

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
		<div>
			<div className="flex justify-center">
				<Image
					src={
						image_url
							? image_url.image_url
							: "/inventory_default.png"
					}
					alt="inventory"
					width={500}
					height={500}
					className="h-[500px] w-[500px] object-contain"
				/>
			</div>
			<div className="flex justify-between p-1">
				<p className=" text-gray-400">{product.item_code}</p>
				<p className=" text-gray-400">{product.bar_code}</p>
			</div>
		</div>
	);
}

export default ProductDetails;
