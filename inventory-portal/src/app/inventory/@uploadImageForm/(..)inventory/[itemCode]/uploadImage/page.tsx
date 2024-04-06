'use client';

import { zodResolver } from '@hookform/resolvers/zod';
import { useForm } from 'react-hook-form';
import { z } from 'zod';

import { Button } from '@/components/ui/button';
import {
  Form,
  FormControl,
  FormField,
  FormItem,
  FormLabel,
  FormMessage,
} from '@/components/ui/form';
import { Dialog, DialogContent, DialogHeader, DialogTitle } from '@/components/ui/dialog';
import { Input } from '@/components/ui/input';
import { ChangeEvent, useState } from 'react';
import { useRouter } from 'next/navigation';
import { useToast } from '@/components/ui/use-toast';
import { AppError } from '@/constant/app-error';
import { inventoryImageUploadConfig } from '@/constant/file-upload-configuration';
import { Loader2 } from 'lucide-react';

const FormSchema = z.object({
  file: z
    .any()
    .refine((files) => files?.length == 1, AppError.INVENTORY_IMAGE_NOT_FOUND.displayMessage)
    .refine(
      (files) => files?.[0]?.size <= inventoryImageUploadConfig.MAX_UPLOAD_SIZE,
      AppError.INVENTORY_IMAGE_FILE_TOO_LARGE.displayMessage,
    )
    .refine(
      (files) => inventoryImageUploadConfig.ACCEPTED_FILE_TYPES.includes(files?.[0]?.type),
      AppError.INVENTORY_IMAGE_WRONG_FILE_TYPE.displayMessage,
    ),
});

export default function UploadImageForm({
  params: { itemCode },
}: {
  params: { itemCode: string };
}) {
  const router = useRouter();
  const { toast } = useToast();
  const [isUploading, setIsUploading] = useState(false);

  const form = useForm<z.infer<typeof FormSchema>>({
    resolver: zodResolver(FormSchema),
    mode: 'onSubmit',
  });

  async function onSubmit(data: z.infer<typeof FormSchema>) {
    const file = data.file?.[0];
    const formData = new FormData();
    formData.append('file', file);

    // Send formData to server-side endpoint
    setIsUploading(true);
    const response = await fetch(`/api/inventory/${itemCode}/image`, {
      method: 'POST',
      body: formData,
    });
    setIsUploading(false);

    if (response.ok) {
      toast({
        description: 'Image Uploaded',
        className: 'bg-green-600 text-white',
      });
      router.back();
      router.refresh();
    } else {
      // Handle error
      toast({
        variant: 'destructive',
        description: 'Image Upload Failed',
      });
    }
  }

  function handleDialogInteractOutside(event: Event) {
    if (isUploading) event.preventDefault();
  }

  function getImageData(event: ChangeEvent<HTMLInputElement>) {
    // Refer to https://github.com/shadcn-ui/ui/issues/250
    const dataTransfer = new DataTransfer();

    Array.from(event.target.files!).forEach((image) => dataTransfer.items.add(image));

    const files = dataTransfer.files;

    return files;
  }

  return (
    <Dialog open={true} onOpenChange={() => router.back()}>
      <DialogContent className="sm:max-w-[425px]" onInteractOutside={handleDialogInteractOutside}>
        <DialogHeader>
          <DialogTitle>Upload Image</DialogTitle>
        </DialogHeader>
        <Form {...form}>
          <form onSubmit={form.handleSubmit(onSubmit)} className="w-2/3 space-y-6">
            <FormField
              control={form.control}
              name="file"
              render={({ field: { value, onChange, ...fieldProps } }) => (
                <FormItem>
                  <FormLabel>Image</FormLabel>
                  <FormControl>
                    <Input
                      type="file"
                      className="w-auto"
                      {...fieldProps}
                      onChange={(event) => {
                        const files = getImageData(event);
                        onChange(files);
                      }}
                    />
                  </FormControl>
                  <FormMessage />
                </FormItem>
              )}
            />
            {isUploading ? (
              <Button type="submit" disabled>
                <Loader2 className="mr-2 h-4 w-4 animate-spin" />
                Please wait
              </Button>
            ) : (
              <Button type="submit">Submit</Button>
            )}
          </form>
        </Form>
      </DialogContent>
    </Dialog>
  );
}
