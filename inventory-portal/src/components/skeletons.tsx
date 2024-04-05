import React from "react";

export function InventoryListSkeleton() {
	return (
		<div className="grid grid-cols-2 md:grid-cols-3 lg:grid-cols-3 xl:grid-cols-5 gap-10">
			{[...Array(10)].map((_, index) => (
				<div
					key={index}
					className="p-2 flex flex-col gap-2 bg-gray-300 rounded-lg shadow-lg animate-pulse"
				>
					<div className="flex justify-center">
						<div className="h-40 w-40 bg-gray-400 rounded"></div>
					</div>
					<div className="h-fit">
						<div className="flex flex-col gap-1 p-1 text-xs md:flex-row md:justify-between">
							<div className="flex gap-0.5 items-center">
								<div className="h-4 w-4 bg-gray-400 rounded"></div>
								<div className="h-4 bg-gray-400 rounded w-3/4"></div>
							</div>
							<div className="flex gap-0.5 items-center">
								<div className="h-4 w-4 bg-gray-400 rounded"></div>
								<div className="h-4 bg-gray-400 rounded w-3/4"></div>
							</div>
						</div>
						<div className="h-16 bg-gray-400 rounded mt-1 p-1"></div>
						<div className="flex justify-between my-1 p-1 text-sm">
							<div className="flex gap-0.5 items-center">
								<div className="h-4 w-4 bg-gray-400 rounded"></div>
								<div className="h-4 bg-gray-400 rounded w-1/4"></div>
							</div>
							<div className="flex gap-0.5 items-center">
								<div className="h-4 w-4 bg-gray-400 rounded"></div>
								<div className="h-4 bg-gray-400 rounded w-1/4"></div>
							</div>
						</div>
					</div>
				</div>
			))}
		</div>
	);
}

export function FilterSheetSkeleton() {
	return (
		<div className="animate-pulse">
			<div className="p-2 flex flex-col gap-2 bg-gray-300 rounded-lg shadow-lg">
				<div className="flex justify-center">
					<div className="h-8 w-8 bg-gray-400 rounded"></div>
				</div>
				<div className="h-fit">
					<div className="h-6 bg-gray-400 rounded mt-1 p-1"></div>
					<div className="h-4 bg-gray-400 rounded mt-1 p-1"></div>
					<div className="flex flex-col gap-1 p-1 text-xs md:flex-row md:justify-between">
						<div className="flex gap-0.5 items-center">
							<div className="h-4 w-4 bg-gray-400 rounded"></div>
							<div className="h-4 bg-gray-400 rounded w-3/4"></div>
						</div>
					</div>
					<div className="h-16 bg-gray-400 rounded mt-1 p-1"></div>
					<div className="flex justify-between my-1 p-1 text-sm">
						<div className="flex gap-0.5 items-center">
							<div className="h-4 w-4 bg-gray-400 rounded"></div>
							<div className="h-4 bg-gray-400 rounded w-1/4"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	);
}

export function PaginationSkeleton() {
	return (
		<div className="flex items-center space-x-4 animate-pulse">
			<div className="h-8 w-8 bg-gray-300 rounded"></div>
			{[...Array(5)].map((_, index) => (
				<div key={index} className="h-8 w-8 bg-gray-300 rounded"></div>
			))}
			<div className="h-8 w-8 bg-gray-300 rounded"></div>
		</div>
	);
}
