<template>
  <div>
    <button type="button" class="btn btn-outline-info btn-sm" v-for="(item,index) of btntxt" @click="login(index)" >{{item}}</button>
  </div>
</template>

<script>
    export default {
        name: "button-gl",
        props:["btntxt"],
        methods:{
          login:function (index) {
            if (index == 0) {
              this.$router.push({path: '/user/login'})
            }
            else {
              this.$router.push({path: '/user/register'})
            }
          }
      }
    }
</script>

<style scoped>
  button{
    margin-right: 10px;
  }
</style>
