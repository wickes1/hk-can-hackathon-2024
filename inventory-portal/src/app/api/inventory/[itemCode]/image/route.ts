import { utapi } from "@/lib/uploadthing";
import { GenericResponseModel } from "@/model/generic-response.model";
import { NextResponse } from "next/server";
import { NextRequest } from "next/server";
import { ZodError, z } from "zod";
import logger from "../../../../../../logger";
import { AppError } from "@/constant/app-error";
import prisma from "@/lib/prisma";
import { Prisma } from "@prisma/client";
import { inventoryImageUploadConfig } from "@/constant/file-upload-configuration";

const schema = z.object({
  file: z
    .instanceof(File)
    .refine(
      (file) => file.size <= inventoryImageUploadConfig.MAX_UPLOAD_SIZE,
      AppError.INVENTORY_IMAGE_FILE_TOO_LARGE.errorCode
    )
    .refine(
      (file) =>
        inventoryImageUploadConfig.ACCEPTED_FILE_TYPES.includes(file.type),
      AppError.INVENTORY_IMAGE_WRONG_FILE_TYPE.errorCode
    ),
});

export async function POST(
  req: NextRequest,
  { params }: { params: { itemCode: string } }
) {
  try {
    const formData = await req.formData();
    const parsed = schema.parse(Object.fromEntries(formData.entries()));
    const result = await utapi.uploadFiles(parsed.file);

    // ensure that the itemCode exists in database
    await prisma.inventory.findUniqueOrThrow({
      where: {
        item_code: params.itemCode,
      },
    });

    // upsert inventory display property entity
    let upsertArgs: Prisma.inventory_display_propertiesUpsertArgs = {
      where: {
        item_code: params.itemCode,
      },
      create: {
        item_code: params.itemCode,
        image_url: result.data?.url,
      },
      update: {
        image_url: result.data?.url,
      },
    };
    await prisma.inventory_display_properties.upsert(upsertArgs);

    return NextResponse.json(new GenericResponseModel({ isSuccess: true }));
  } catch (error) {
    if (error instanceof ZodError) {
      logger.error(JSON.stringify(error));
      return NextResponse.json(
        new GenericResponseModel({ isSuccess: false, zodError: error }),
        {
          status: 400,
        }
      );
    }

    logger.error(error);
    return NextResponse.json(
      new GenericResponseModel({
        isSuccess: false,
        errorCode: AppError.INTERNAL_SERVER_ERROR.errorCode,
      }),
      { status: 500 }
    );
  }
}
