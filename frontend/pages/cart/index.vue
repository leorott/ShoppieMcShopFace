<template>
  <div class="product-item" v-for="item in items">
      {{item}}
  </div>
  <button @click="checkout()">Checkout</button>
</template>
<script setup lang="ts">

const { data } = await useFetch('http://localhost:8080/cartItems');
const items = data.value;

const router = useRouter();

const checkout = async () => {
    await useFetch('http://localhost:8080/cartItems/delete-all');
    await router.push('/');
}
</script>