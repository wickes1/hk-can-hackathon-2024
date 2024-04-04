import Pagination from "@/components/pagination";
import InventoryList from "@/components/inventory-list";
import { fetchInventoryTotal } from "@/lib/data";

export default async function Inventory({
	searchParams
}: {
	searchParams?: {
		query?: string;
		page?: string;
	};
}) {
	const query = searchParams?.query || "";
	const currentPage = Number(searchParams?.page) || 1;
	const [totalPages, totalCount] = await fetchInventoryTotal(query);

	return (
		<div>
			<div className="mt-5 flex justify-center">
				<p className="text-lg">{totalCount} items found</p>
			</div>
			<InventoryList query={query} page={currentPage} />

			<div className="mt-10 flex w-full justify-center">
				<Pagination totalPages={totalPages} />
			</div>
		</div>
	);
}
