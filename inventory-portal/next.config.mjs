/** @type {import('next').NextConfig} */
import withPWAInit from '@ducanh2912/next-pwa';

const withPWA = withPWAInit({
  dest: 'public',
});
const nextConfig = {
  images: {
    domains: ['utfs.io'],
  },
  async redirects() {
    return [
      {
        source: '/',
        destination: '/inventory',
        permanent: true,
      },
    ];
  },
};

export default nextConfig;
