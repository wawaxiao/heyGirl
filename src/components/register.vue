<template>
  <div>
    <header-nav v-if="false"></header-nav>
    <div class="row justify-content-md-center">
      <div class="card border-info mb-3 ">
        <card-header></card-header>
        <div class="card-body">
          <input-gl :lgtxt="registerText" ref="inputgl"></input-gl>
          <button type="button" class="btn btn-info rounded" @click="submit()">{{option}}</button>
          <card-footer :option="option"></card-footer>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import inputgl from '../components/input-gl'
  import headerNav from './headerNav'
  import cardheader from '../components/card-header'
  import cardfooter from '../components/card-footer'

  export default {
    name: "register",
    data:function(){
      return {
        option:'注册',
        registerText:['你的昵称','手机号','设置密码'],
      }
    },
    components:{
      'card-header':cardheader,
      'card-footer':cardfooter,
      'input-gl':inputgl,
      'header-nav':headerNav
    },
    methods:{
      submit:function () {
        this.$.post('').then()
      }
    }
  }
</script>
<style scoped>
  button{
    width:100%;
    margin-top: 25px;
  }


</style>
