<template>
<div>
    <h1>{{name}}</h1>
    <h2>{{price}} CHF</h2>
    <h3>Kategorie: {{category}}</h3>
    <p>Beschreibung: {{description}}</p>
    Anzahl: <input v-model="quantity">
    <button @click="addToCart(product.id)">In den Warenkorb</button>
</div>
</template>
<script setup lang="ts">
import type { Product } from "~/utils/types";

const id = useRouter().currentRoute.value.path.split('/').pop()

//const { data } =  await useFetch(`http://localhost:8080/products/${id}`);
//const product = data.value;

const { data } =  await useFetch('/api/products');
const products: Product[] | null = data.value;
const product = products?.find((product) => String(product.id) === id);

const name = product.name;
const price = product.price;
const category = product.category;
const description = product.description;

const quantity = ref(0);

const addToCart = async (id: string) => {
    await useFetch('http://localhost:8080/cartItems', {
       method: "post" ,
        body: {
           product: product,
           quantity: quantity,
        }
    });
}
</script>