<template>
  <div>
    <nav class="navbar fixed-top navbar-light bg-light justify-content-between">
        <h6>首页</h6>
        <button-gl :btntxt="buttonText" ></button-gl>
    </nav>
  </div>
</template>

<script>
  import buttongl from '../components/button-gl'
  export default {
        name: "header-nav",
        components:{
          'button-gl':buttongl
        },
        data:function () {
          return {
            buttonText:['登录','注册']
          }
        },
    methods:{

      }
    }
</script>

<style scoped>
nav{
  width: inherit;
}

</style>
