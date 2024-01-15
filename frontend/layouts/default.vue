<template>
    <div class="nav-bar">
      <a href="/">Shop</a>
      <div class="nav-items">
          <a class="nav-item" href="/products">Products</a>
          <a class="nav-item" href="/cart">Cart</a>
          <a class="nav-item" href="/login">Login</a>
      </div>
  </div>
  <NuxtPage />
</template>
<style>
.nav-bar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 20px;
    font-size: larger;
}

.nav-items {
    display: flex;
}

.nav-item {
    margin-right: 10px;
}
</style>
<script setup lang="ts">
</script>
<style>
p {
    font-family: -apple-system;
}
</style>