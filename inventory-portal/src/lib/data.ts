import prisma from "./prisma";

const ITEMS_PER_PAGE = 10;

export async function fetchInventoryTotal(query: string) {
	const count = await prisma.inventory.count({
		where: {
			OR: [
				{ bar_code: { contains: query, mode: "insensitive" } },
				{ item_code: { contains: query, mode: "insensitive" } },
				{ description: { contains: query, mode: "insensitive" } }
			]
		}
	});

	return [Math.ceil(count / ITEMS_PER_PAGE), count];
}

export async function findFilteredInventory(query: string, page: number) {
	const products = await prisma.inventory.findMany({
		where: {
			OR: [
				{ bar_code: { contains: query, mode: "insensitive" } },
				{ item_code: { contains: query, mode: "insensitive" } },
				{ description: { contains: query, mode: "insensitive" } }
			]
		},
		skip: (page - 1) * ITEMS_PER_PAGE,
		take: ITEMS_PER_PAGE
	});
	return products;
}
