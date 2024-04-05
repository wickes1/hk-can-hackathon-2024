module.exports = {
  extends: ['next', 'eslint:recommended', 'next/core-web-vitals', 'prettier'],
  plugins: ['react'],
  parserOptions: {
    ecmaVersion: 2021,
    sourceType: 'module',
  },
  rules: {
    'no-undef': 'off',
    'no-unused-vars': 'off',
  },
};
