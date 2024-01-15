<template>
  <div>
      Username: <input v-model="username">
      Password: <input v-model="password">
      <button @click="login()">Login</button>
  </div>
</template>
<script setup lang="ts">
const username = ref('');
const password = ref('');

const login = async () => {
    await useFetch('')
}

</script>