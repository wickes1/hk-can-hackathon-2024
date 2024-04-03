import React from "react";
import { inventory } from "@prisma/client";
import Image from "next/image";
import prisma from "@/lib/prisma";

async function ProductCard({ product }: { product: inventory }) {
	const image_url = await prisma.inventory_display_properties.findFirst({
		where: {
			item_code: product.item_code
		},
		select: {
			image_url: true
		}
	});
	return (
		<div className="mt-2  p-2 rounded-lg  shadow-lg hover: transform hover:-translate-y-1 hover:scale-110 transition-all duration-200 ease-in-out cursor-pointer">
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
					className="h-[200px] w-[200px] object-cover"
				/>
			</div>
			<div className="flex justify-between p-1">
				<p className="truncate">{product.item_code}</p>
				<p className="truncate">{product.bar_code}</p>
			</div>
			<h2 className="text-lg mt-1 p-1 font-bold truncate hover:text-clip">
				{product.description}
			</h2>
			<div className="flex justify-between mt-1 p-1">
				<h2 className="font-bold truncate">${product.sales_price}</h2>
				<h2 className="font-bold truncate">QTY {product.quantity}</h2>
			</div>
		</div>
	);
}

export default ProductCard;
