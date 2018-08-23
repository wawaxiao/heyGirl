// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import 'bootstrap/dist/css/bootstrap.css'
import axios from 'axios'
import store from './vuex/store'

Vue.prototype.$axios= axios

new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
