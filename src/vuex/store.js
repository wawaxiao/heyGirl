import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
  // 定义状态
  state: {
    isLogin: false,
    user:""
  },
  mutations:{
    changeState(state,msg){
      state.isLogin = msg
    },
    transUser(state,user){
      state.user = user
    }
  }
})

export default store
