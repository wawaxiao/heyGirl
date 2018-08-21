<template>
  <div>
    <header-nav></header-nav>
  </div>
</template>

<script>
  import headerNav from '../components/header-nav'
    export default {
      name: "common-page",
      components:{
          "header-nav":headerNav
        }
    }
</script>

<style scoped>

</style>
