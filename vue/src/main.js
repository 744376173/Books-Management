import Vue from 'vue'
import App from './App.vue'
import router from './router'
// 完整引入
import ElementUI from 'element-ui'; // 引入ui 组件库
import 'element-ui/lib/theme-chalk/index.css'; //ui 组件库的 css 样式
import '@/assets/global.css'

Vue.use(ElementUI)

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
