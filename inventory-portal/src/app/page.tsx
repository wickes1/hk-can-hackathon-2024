import NavBar from "@/components/nav-bar";
import ProductList from "@/components/product-list";
import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";

export default async function Home() {
	const products: inventory[] = await prisma.inventory.findMany({
		skip: 0,
		take: 10
	});

	return (
		<div>
			<NavBar />
			<ProductList products={products} />
		</div>
	);
}
