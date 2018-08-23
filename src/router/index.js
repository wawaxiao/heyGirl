import Vue from 'vue'
import Router from 'vue-router'
import register from '@/components/register'
import login from '@/components/login'
import home from '@/components/home'
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
      component:home,
    },
    {
      path:'/user',
      component:user,
      children:[
      {
        path:'/user/login',
        component:login
      },
      {
        path:'/user/register',
        component:register
      }]
    }
  ]
})
