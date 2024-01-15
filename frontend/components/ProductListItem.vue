<template>
  <div class="product-item">
      <h1>{{product.name}}</h1>
      <p>{{product.price}} .-</p>
      <NuxtLink :to="getProductDetail(String(product.id))">
          -->
      </NuxtLink>
  </div>
</template>
<script setup lang="ts">
import type { Product } from "~/utils/types";
import { defineProps } from 'vue'

defineProps<{
    product: Product
}>()

const getProductDetail = (id: string) => `/products/${id}`
</script>
<style>
.product-item {
    border-style: solid;
    border-radius: 10px;
    margin: 20px;
    padding: 10px;
}
</style>