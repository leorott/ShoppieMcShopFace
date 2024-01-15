<template>
  <div class="product-list" v-for="productItem in products">
      <ProductListItem :product="productItem"/>
  </div>
</template>
<script setup lang="ts">
import type { Product } from "~/utils/types";
import ProductListItem from "~/components/ProductListItem.vue";

const { data } =  await useFetch('/api/products');
//const { data } = await useFetch('http://localhost:8080/products');

const products: Product[] | null = data.value;
</script>