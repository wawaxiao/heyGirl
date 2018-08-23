<template>
  <div>
    <router-view></router-view>
  </div>
</template>

<script>

  import headerNav from '../components/headerNav'
  export default {
    name: 'user',
    data:function(){
      return{
      }
    },
    components:{
      headerNav
    }
  }
</script>

<style scoped>

</style>
