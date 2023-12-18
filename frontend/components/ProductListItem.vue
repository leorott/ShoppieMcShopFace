<template>
  <div class="product-item">
      <NuxtLink :to="getProductDetail(String(product.id))">
          <h1>{{product.name}}</h1>
          <span>{{product.price}} .-</span>
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
}
</style>