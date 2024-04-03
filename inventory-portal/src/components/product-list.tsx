import React from "react";
import { inventory } from "@prisma/client";
import ProductCard from "./product-card";
import { Drawer, DrawerContent, DrawerTrigger } from "@/components/ui/drawer";
import ProductDetails from "./product-details";

function ProductList({ products }: { products: inventory[] }) {
	return (
		<div
			className="grid
        grid-cols-1
        md:grid-cols-2
        lg:grid-cols-5
        gap-2 mt-2
        "
		>
			{products.map(product => (
				<Drawer key={product.item_code}>
					<DrawerTrigger>
						<ProductCard product={product} />
					</DrawerTrigger>
					<DrawerContent>
						<ProductDetails product={product} />
					</DrawerContent>
				</Drawer>
			))}
		</div>
	);
}

export default ProductList;
