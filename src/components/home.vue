<template>
  <div>
    <header-nav></header-nav>
  </div>
</template>

<script>
  import headerNav from '../components/headerNav'
    export default {
      name: "common",
      components:{
          "header-nav":headerNav
        },
      data:function () {
        return{

        }
      }
    }
</script>

<style scoped>

</style>
