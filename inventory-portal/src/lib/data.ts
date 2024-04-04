import { InventorySortType } from "./definitions";
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

function getOrderBy(
	sort?: InventorySortType
): { [key: string]: "asc" | "desc" } | undefined {
	switch (sort) {
		case "price-asc":
			return { sales_price: "asc" };
		case "price-desc":
			return { sales_price: "desc" };
		case "quantity-asc":
			return { quantity: "asc" };
		case "quantity-desc":
			return { quantity: "desc" };
		default:
			return { item_code: "asc" };
	}
}

export async function findFilteredInventory(
	query: string,
	page: number,
	sort?: InventorySortType
) {
	const inventories = await prisma.inventory.findMany({
		where: {
			OR: [
				{ bar_code: { contains: query, mode: "insensitive" } },
				{ item_code: { contains: query, mode: "insensitive" } },
				{ description: { contains: query, mode: "insensitive" } }
			]
		},
		skip: (page - 1) * ITEMS_PER_PAGE,
		take: ITEMS_PER_PAGE,
		// if sort is price-asc, sort by price in ascending order
		// if sort is price-desc, sort by price in descending order
		// if sort is quantity-asc, sort by quantity in ascending order
		// if sort is quantity-desc, sort by quantity in descending order
		orderBy: getOrderBy(sort)
	});

	return inventories;
}
