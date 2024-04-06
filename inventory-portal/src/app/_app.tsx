import type { AppProps } from 'next/app';
import Head from 'next/head';

export default function App({ Component, pageProps }: AppProps) {
  return (
    <>
      <Head>
        <meta name="viewport" content="width=device-width,initial-scale=1" />
        <title>Inventory Catalog</title>
        <meta name="description" content="Inventory Catalog App" />
        <link rel="shortcut icon" href="/favicon.ico" />
        <link rel="mask-icon" href="/icons/mask-icon.svg" color="#FFFFFF" />
        <meta name="theme-color" content="#ffffff" />
        <link rel="manifest" href="/manifest.json" />
        <meta name="twitter:card" content="summary" />
        <meta name="twitter:url" content="https://yourdomain.com" />
        <meta name="twitter:title" content="Inventory Catalog" />
        <meta name="twitter:description" content="Inventory Catalog App" />
        <meta name="twitter:image" content="/icons/twitter.png" />
        <meta property="og:type" content="website" />
        <meta property="og:title" content="Inventory Catalog" />
        <meta property="og:description" content="Inventory Catalog App" />
        <meta property="og:site_name" content="Inventory Catalog" />
        <meta property="og:url" content="https://yourdomain.com" />
        <meta property="og:image" content="/icons/og.png" />
      </Head>
      <Component {...pageProps} />
    </>
  );
}
