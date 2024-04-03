import { utapi } from "@/lib/uploadthing";
import { NextResponse } from "next/server";
import { NextRequest } from "next/server";

export async function POST(req: NextRequest) {
  const formData = await req.formData();
  const file = formData.get("file") as File;
  const response = await utapi.uploadFiles(file);
  console.log(JSON.stringify(response));
  return NextResponse.json({
    success: true,
  });
}
