import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '../components/login.vue'
import home from '../components/home.vue'
import helloworld from '../components/helloworld'

Vue.use(VueRouter);

const routes = [
  {
    {
      path:'/',
      redirect: {name: 'login'}
    },
  {
    path:'/helloworld',
    name:'helloworld',
    component:helloworld
  },
  {
    path:'/home',
    component:home
  }
];

const router = new Router({
  mode: 'history',
  routes
});
export default router;
