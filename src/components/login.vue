<template>
  <div class="row justify-content-md-center">
    <div class="card border-info mb-3 ">
      <card-header></card-header>
      <div class="card-body">
        <input-gl :lgtxt="loginText" ref="inputgl"></input-gl>
        <div class="form-check">
          <input type="checkbox" class="form-check-input" id="exampleCheck1">
          <label class="form-check-label" for="exampleCheck1">记住我</label>
          <label class="form-check-label" for="exampleCheck1">忘记密码?</label>
        </div>
        <button type="button" class="btn btn-info rounded" @click="validate()">{{option}}</button>
        <card-footer :option="option"></card-footer>
      </div>
    </div>
  </div>
</template>

<script>
  import inputgl from '../components/input-gl'
  import cardheader from '../components/card-header'
  import cardfooter from '../components/card-footer'

  export default {
    name: "login",
    data:function(){
      return {
        option:'登录',
        loginText:['手机号或邮箱','密码'],
      }
    },
    components:{
      'input-gl':inputgl,
      'card-header':cardheader,
      'card-footer':cardfooter
    },
    methods: {
      validate:function () {
        this.$refs.inputgl.setData();
        let account = this.$refs.inputgl.account;
        let passwd = this.$refs.inputgl.passwd;
        let url= "http://localhost:8080/wwc/user/login";
        this.$axios.get(url,{
          account:account,
          password:passwd
          }).then(function (response) {
          console.log(response.body);
        });
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
