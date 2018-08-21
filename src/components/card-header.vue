<template>
  <div class="card-header ">
    <router-link :to="{path:'/user/login'}">登录</router-link>
    <span>&nbsp;·&nbsp;</span>
    <router-link :to="{path:'/user/register'}">注册</router-link>
  </div>
</template>

<script>
    export default {
        name: "card_head"
    }
</script>

<style scoped>
  *{
    color: #969696;
    font-size: 18px;
  }
  a,a.router-link-active{
    text-decoration: none;
    font-weight: bolder;
  }
  a:hover{
    color: #969696;
  }
  a.router-link-active{
    color:#17a2b8;
  }
  span{
    padding:10px;
    font-weight: 700;
  }
</style>
