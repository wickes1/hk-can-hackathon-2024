import React from "react";
import { inventory } from "@prisma/client";
import ProductCard from "./product-card";
import { Drawer, DrawerContent, DrawerTrigger } from "@/components/ui/drawer";
import ProductDetails from "./product-details";

function ProductList({ products }: { products: inventory[] }) {
	return (
		<div
			className="grid
        grid-cols-2
        md:grid-cols-3
        lg:grid-cols-5
        gap-10 mt-5 mx-5

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
