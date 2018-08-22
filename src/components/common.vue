<template>
  <div>
    <header-nav v-if="!isLogin"></header-nav>
  </div>
</template>

<script>
  import headerNav from '../components/header-nav'
    export default {
      name: "common",
      components:{
          "header-nav":headerNav
        },
      props:["isLogin"]
      ,
      data:function () {
        return{
        }
      }
    }
</script>

<style scoped>

</style>
