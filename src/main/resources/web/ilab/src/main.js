import Vue from 'vue'
import App from './App'
import VueResource from 'vue-resource'
import ElementUI from 'element-ui'
import router from './router'

Vue.use(ElementUI);
Vue.use(VueResource);
Vue.use(router);

Vue.config.productionTip = false;

//设置全局表单提交实例
Vue.http.options.emulateJSON = true;

//Vue实例
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})

// new Vue({
//   el: '#app',
//   render: h => h(App)
// })
