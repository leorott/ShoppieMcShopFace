<template>
  <div class="product-list" v-for="productItem in products">
      <ProductListItem :product="productItem"/>
  </div>
</template>
<script setup lang="ts">
import type { Product } from "~/utils/types";
import ProductListItem from "~/components/ProductListItem.vue";
import type {Ref} from "vue";

const products: Product[] = [
    {
        id: 1,
        name: "Kaffeebohnen Rustico",
        price: 37,
        description: "lorem ipsum bla bla bla",
        category: "kaffeebohnen"
    },
    {
        id: 2,
        name: "Kaffeebohnen Intenso",
        price: 48,
        description: "lorem ipsum bla bla bla",
        category: "kaffeebohnen"
    },
    {
        id: 3,
        name: "Kaffeefilter",
        price: 107.70,
        description: "lorem ipsum bla bla bla",
        category: "kaffeezubehör"
    },
]
</script>