/** @type {import('next').NextConfig} */
const nextConfig = {
	images: {
		domains: ["utfs.io"]
	},
	async redirects() {
		return [
			{
				source: "/",
				destination: "/inventory",
				permanent: true
			}
		];
	},
	experimental: {
		missingSuspenseWithCSRBailout: false
	}
};

export default nextConfig;
