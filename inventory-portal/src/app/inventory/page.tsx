import InventoryList from "@/components/inventory-list";
import Pagination from "@/components/pagination";
import { fetchInventoryTotal } from "@/lib/data";
import { InventorySortType } from "@/lib/definitions";

export default async function Inventory({
	searchParams
}: {
	searchParams?: {
		query?: string;
		page?: string;
		sort?: InventorySortType;
	};
}) {
	const query = searchParams?.query || "";
	const currentPage = Number(searchParams?.page) || 1;
	const sort = searchParams?.sort || "price-asc";
	const [totalPages, totalCount] = await fetchInventoryTotal(query);

	return (
		<div className="bg-gray-200 h-[90%] overflow-auto">
			<div className="flex flex-col gap-5 mx-5">
				<div className="flex justify-center mt-2">
					<p className="text-lg">{totalCount} items found</p>
				</div>
				<div className="grow">
					<InventoryList
						query={query}
						page={currentPage}
						sort={sort}
					/>
				</div>
				<div className="flex self-end w-full justify-center mb-2">
					<Pagination totalPages={totalPages} />
				</div>
			</div>
		</div>
	);
}
