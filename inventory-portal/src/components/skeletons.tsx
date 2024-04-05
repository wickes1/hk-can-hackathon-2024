import React from 'react';

export function InventoryListSkeleton() {
  return (
    <div className="grid grid-cols-2 gap-10 md:grid-cols-3 lg:grid-cols-3 xl:grid-cols-5">
      {[...Array(10)].map((_, index) => (
        <div
          key={index}
          className="flex animate-pulse flex-col gap-2 rounded-lg bg-gray-300 p-2 shadow-lg"
        >
          <div className="flex justify-center">
            <div className="h-40 w-40 rounded bg-gray-400"></div>
          </div>
          <div className="h-fit">
            <div className="flex flex-col gap-1 p-1 text-xs md:flex-row md:justify-between">
              <div className="flex items-center gap-0.5">
                <div className="h-4 w-4 rounded bg-gray-400"></div>
                <div className="h-4 w-3/4 rounded bg-gray-400"></div>
              </div>
              <div className="flex items-center gap-0.5">
                <div className="h-4 w-4 rounded bg-gray-400"></div>
                <div className="h-4 w-3/4 rounded bg-gray-400"></div>
              </div>
            </div>
            <div className="mt-1 h-16 rounded bg-gray-400 p-1"></div>
            <div className="my-1 flex justify-between p-1 text-sm">
              <div className="flex items-center gap-0.5">
                <div className="h-4 w-4 rounded bg-gray-400"></div>
                <div className="h-4 w-1/4 rounded bg-gray-400"></div>
              </div>
              <div className="flex items-center gap-0.5">
                <div className="h-4 w-4 rounded bg-gray-400"></div>
                <div className="h-4 w-1/4 rounded bg-gray-400"></div>
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
      <div className="flex flex-col gap-2 rounded-lg bg-gray-300 p-2 shadow-lg">
        <div className="flex justify-center">
          <div className="h-8 w-8 rounded bg-gray-400"></div>
        </div>
        <div className="h-fit">
          <div className="mt-1 h-6 rounded bg-gray-400 p-1"></div>
          <div className="mt-1 h-4 rounded bg-gray-400 p-1"></div>
          <div className="flex flex-col gap-1 p-1 text-xs md:flex-row md:justify-between">
            <div className="flex items-center gap-0.5">
              <div className="h-4 w-4 rounded bg-gray-400"></div>
              <div className="h-4 w-3/4 rounded bg-gray-400"></div>
            </div>
          </div>
          <div className="mt-1 h-16 rounded bg-gray-400 p-1"></div>
          <div className="my-1 flex justify-between p-1 text-sm">
            <div className="flex items-center gap-0.5">
              <div className="h-4 w-4 rounded bg-gray-400"></div>
              <div className="h-4 w-1/4 rounded bg-gray-400"></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export function PaginationSkeleton() {
  return (
    <div className="flex animate-pulse items-center space-x-4">
      <div className="h-8 w-8 rounded bg-gray-300"></div>
      {[...Array(5)].map((_, index) => (
        <div key={index} className="h-8 w-8 rounded bg-gray-300"></div>
      ))}
      <div className="h-8 w-8 rounded bg-gray-300"></div>
    </div>
  );
}
