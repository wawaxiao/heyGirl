<template>
  <div>
      <div class="input-group " v-for="(item,index) of lgtxt"  :key="index">
        <div class="input-group-prepend">
          <img v-if="index==0" :src="userSrc">
          <img v-else-if="index==(lgtxt.length-1)" :src="psSrc">
          <img v-else :src="phoneSrc">
        </div>
        <input type="text" v-if="index==0" class="form-control" :placeholder="item" v-model="account">
        <input type="password" v-else-if="index==(lgtxt.length-1)" class="form-control" :placeholder="item" v-model="passwd">
        <input type="text" v-else  class="form-control" :placeholder="item" v-model="phone" >
      </div>
  </div>
</template>

<script>
    export default {
        name: "input-gl",
        props:["lgtxt"],
        data:function () {
          return{
            account:"",
            passwd:"",
            phone:"",
            userSrc:require("../assets/user.png"),
            psSrc:require('../assets/password.png'),
            phoneSrc:require('../assets/phone.png')
          }
        },
      methods:{
          setData:function () {
            let input = document.getElementsByClassName("form-control")

            if(this.account==""||this.account==null){
              alert("请输入"+input[0].placeholder)
              input[0].focus();
            }
            else if(input.length==3&&this.phone==""||this.phone==null){
                alert("请输入"+input[1].placeholder)
                input[1].focus();
            }
            else if(this.passwd==""||this.passwd==null){
              alert("请输入"+input[input.length-1].placeholder)
              input[input.length-1].focus();
            }
          }
      }
    }
</script>

<style scoped>
  img{
    margin-right: 10px;
    height: 20px;
    margin-top: 9px;
  }
  input{
    text-align: left;
  }
  .input-group{
    margin-top: 15px;
  }

</style>
