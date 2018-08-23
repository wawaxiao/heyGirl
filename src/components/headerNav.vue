<template>
  <div>
    <nav class="navbar fixed-top navbar-light bg-light justify-content-between">
        <h6>首页</h6>
        <button-gl :btntxt="buttonText" v-if="!loginstate"></button-gl>
       <span v-if="loginstate">{{getUser.userName}}</span>
    </nav>
  </div>
</template>

<script>
  import buttongl from '../components/button-gl'
  export default {
    name: "headerNav",
    components:{
      'button-gl':buttongl
      },
    data:function () {
      return {
        buttonText:['登录','注册'],
        }
      },
    computed:{
      loginstate(){
        return this.$store.state.isLogin
      },
      getUser(){
        return this.$store.state.user
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
