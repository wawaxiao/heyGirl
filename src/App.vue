<template>
  <div>
    <div class="container">
      <router-view/>
    </div>
  </div>
</template>

<script>

export default {
  components: {
  },
  data: function () {
    return {
    }
  },
  methods: {

  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
  *{
    padding: 0px;
    margin: 0px;
    text-align: center;
  }
  input,label{
    font-size: 14px!important;
  }
  .row{
    margin-top: 100px;
  }
  .card{
    width: 330px;
  }
  .form-check{
    margin-top: 15px;
    text-align: left;
  }
  label:last-child{
    float: right;
  }
</style>
