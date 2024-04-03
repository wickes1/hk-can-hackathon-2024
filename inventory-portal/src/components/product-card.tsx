import React from "react";
import { inventory } from "@prisma/client";
import Image from "next/image";
import prisma from "@/lib/prisma";
import { CardBody, CardContainer, CardItem } from "@/components/ui/3d-card";

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
		<CardContainer className="inter-var">
			<CardBody className="bg-gray-50 relative group/card  dark:hover:shadow-2xl dark:hover:shadow-emerald-500/[0.1] dark:bg-black dark:border-white/[0.2] border-black/[0.1] w-auto sm:w-[30rem] h-auto rounded-xl p-6 border  ">
				<CardItem
					translateZ="50"
					rotateX={20}
					rotateZ={-10}
					className="w-full mt-4"
				>
					<Image
						src={
							image_url
								? image_url.image_url
								: "/inventory_default.png"
						}
						width={300}
						height={300}
						className="h-60 w-full object-cover rounded-xl group-hover/card:shadow-xl"
						alt="thumbnail"
					/>
				</CardItem>
				<CardItem
					as="h1"
					translateZ="200"
					className="text-xl font-bold text-neutral-600 dark:text-white"
				>
					{product.description}
				</CardItem>
				<div className="flex justify-between items-center mt-8">
					<CardItem
						as="p"
						translateZ="50"
						className="text-xl font-bold text-neutral-600 dark:text-white"
					>
						{product.item_code}
					</CardItem>
					<CardItem
						as="p"
						translateZ="60"
						className="text-neutral-500 text-sm max-w-sm mt-2 dark:text-neutral-300"
					>
						{product.bar_code}
					</CardItem>
				</div>
				<div className="flex justify-between items-center mt-2">
					<CardItem
						translateZ={20}
						translateX={-40}
						as="h2"
						className="px-4 py-2 rounded-xl text-lg dark:text-white font-bold"
					>
						${product.sales_price}
					</CardItem>
					<CardItem
						translateZ={20}
						translateX={40}
						as="h2"
						className="px-4 py-2 rounded-xl text-lg dark:text-white font-bold"
					>
						QTY {product.quantity}
					</CardItem>
				</div>
			</CardBody>
		</CardContainer>
	);
}

export default ProductCard;
