import globals from "globals";
import pluginJs from "@eslint/js";

/** @type {import('eslint').Linter.Config[]} */
export default [
  {
    rules: {
      "no-unused-vars": "error",
      "prefer-const": ["error", { "ignoreReadBeforeAssign": true }],
      semi: ["error"],
      // "no-console": "error"
    },
    files: ["**/*.js"],
    languageOptions: {
      sourceType: "commonjs",
    },
  },
  {
    languageOptions: {
      globals: globals.node,
    },
  },
  {
    files: ["*.test.js", "*.spec.js"],
    languageOptions: {
      globals: {
        ...globals.node, 
        ...globals.jest, // Add jest globals
      },
    },
  },
  pluginJs.configs.recommended,
];
