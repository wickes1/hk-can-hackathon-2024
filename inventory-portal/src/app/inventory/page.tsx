import ProductList from "@/components/product-list";
import prisma from "@/lib/prisma";
import { inventory } from "@prisma/client";

export default async function Inventory() {
  const products: inventory[] = await prisma.inventory.findMany({
    skip: 0,
    take: 10,
  });

  return (
    <div>
      <ProductList products={products} />
    </div>
  );
}
