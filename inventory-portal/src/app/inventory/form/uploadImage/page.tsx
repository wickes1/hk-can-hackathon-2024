"use client";

import { zodResolver } from "@hookform/resolvers/zod";
import { useForm } from "react-hook-form";
import { z } from "zod";

import { Button } from "@/components/ui/button";
import {
  Form,
  FormControl,
  FormDescription,
  FormField,
  FormItem,
  FormLabel,
  FormMessage,
} from "@/components/ui/form";
import { Input } from "@/components/ui/input";
import { useToast } from "@/components/ui/use-toast";
import Image from "next/image";
import { ChangeEvent } from "react";

const MAX_UPLOAD_SIZE = 1024 * 1024 * 4; // 4MB
const ACCEPTED_FILE_TYPES = ["image/png", "image/jpeg"];

const FormSchema = z.object({
  file: z
    .any()
    .refine((files) => files?.length == 1, "Image is required.")
    .refine(
      (files) => files?.[0]?.size <= MAX_UPLOAD_SIZE,
      `Max file size is 4MB.`
    )
    .refine(
      (files) => ACCEPTED_FILE_TYPES.includes(files?.[0]?.type),
      "Only .jpg, .jpeg and .png file is accepted."
    ),
});

export default function UploadImageForm() {
  const { toast } = useToast();

  const form = useForm<z.infer<typeof FormSchema>>({
    resolver: zodResolver(FormSchema),
    mode: "onSubmit",
  });

  function onSubmit(data: z.infer<typeof FormSchema>) {
    toast({
      title: "You submitted the following file:",
      description: (
        <pre className="mt-2 w-[340px] rounded-md bg-slate-950 p-4">
          <code className="text-white">
            {JSON.stringify({ data }, null, 2)}
          </code>
        </pre>
      ),
    });
  }

  function getImageData(event: ChangeEvent<HTMLInputElement>) {
    // Refer to https://github.com/shadcn-ui/ui/issues/250
    const dataTransfer = new DataTransfer();

    Array.from(event.target.files!).forEach((image) =>
      dataTransfer.items.add(image)
    );

    const files = dataTransfer.files;

    return files;
  }

  return (
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
                  {...fieldProps}
                  onChange={(event) => {
                    const files = getImageData(event);
                    onChange(files);
                  }}
                />
              </FormControl>
              <FormDescription>
                This is your public display name.
              </FormDescription>
              <FormMessage />
            </FormItem>
          )}
        />
        <Button type="submit">Submit</Button>
      </form>
    </Form>
  );
}
