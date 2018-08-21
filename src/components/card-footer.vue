<template>
    <div class="footer">
      <p>社交账号{{option}}</p>
      <div class="img-jstify">
        <img src="../assets/weibo.png">
        <img src="../assets/wechat.png">
        <img src="../assets/qq.png">
        <span>其他</span>
      </div>
    </div>
</template>

<script>
    export default {
        name: "card-footer",
        props:["option"]
    }
</script>

<style scoped>
  .footer{
    width: 100%;
    margin-top: 20px;
  }
  .footer p{
    position: relative;
    font-size: 12px;
    margin: 0 0 10px;
    color: #b5b5b5;
  }
  p:before,p:after{
    width: 80px;
    content: "";
    display: block;
    border-top: 1px solid #ddd;
    position: absolute;
    top:10px;
  }
  p:after{
    right: 0px;
  }
  .img-jstify{
    font-size: 14px;
    width: 100%;
    height: 25px;
    margin: 20px 0;
  }
  .img-jstify *{
    width: 25px;
    margin:0 15px;
    line-height: 25px;
    white-space:nowrap;
  }
</style>
