import Vue from 'vue'
import Router from 'vue-router'
import todoItem from '@/components/todoItem'
import register from '@/components/register'
import login from '@/components/login'
import common from '@/components/common'
import user from '@/components/user'
Vue.use(Router)


export default new Router({
  routes: [
    {
      path:"/",
      redirect:"/home"
    },
    {
      path:"/home",
      component:common,
    },
    {
      path:'/user',
      component:user,
      children:[
      {
        path:'/user/login',
        component:login
      },{
        path:'/user/register',
        component:register
      }
    ]
    },
    {
      path: '/todoItem',
      component: todoItem
    }
  ]
})
