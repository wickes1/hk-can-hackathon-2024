import { InventorySortType } from "./definitions";
import prisma from "./prisma";

const ITEMS_PER_PAGE = 10;

export async function fetchInventoryTotal(
	query: string,
	availableItems?: boolean
) {
	const count = await prisma.inventory.count({
		where: {
			OR: [
				{ bar_code: { contains: query, mode: "insensitive" } },
				{ item_code: { contains: query, mode: "insensitive" } },
				{ description: { contains: query, mode: "insensitive" } }
			],
			AND: availableItems ? [{ is_active: true }] : []
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
		case "item_code-asc":
			return { item_code: "asc" };
		case "item_code-desc":
			return { item_code: "desc" };
		default:
			return { item_code: "asc" };
	}
}

export async function findFilteredInventory(
	query: string,
	page: number,
	sort?: InventorySortType,
	availableItems?: boolean
) {
	const inventories = await prisma.inventory.findMany({
		where: {
			OR: [
				{ bar_code: { contains: query, mode: "insensitive" } },
				{ item_code: { contains: query, mode: "insensitive" } },
				{ description: { contains: query, mode: "insensitive" } }
			],
			AND: availableItems ? [{ is_active: true }] : []
		},
		skip: (page - 1) * ITEMS_PER_PAGE,
		take: ITEMS_PER_PAGE,
		orderBy: getOrderBy(sort)
	});

	return inventories;
}
