import { createEnv } from '@t3-oss/env-nextjs';
import { z } from 'zod';

// https://env.t3.gg/docs/nextjs
export const env = createEnv({
  server: {
    DATABASE_URL: z.string().url().min(1),
    UPLOADTHING_SECRET: z.string().min(1),
  },
  client: {},
  // For Next.js >= 13.4.4, you only need to destructure client variables:
  experimental__runtimeEnv: {},
});
