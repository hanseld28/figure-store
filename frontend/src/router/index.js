import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '@/components/Dashboard'
import ActionFigure from '@/components/ActionFigure'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Dashboard',
      component: Dashboard
    },
    {
      path: '/products',
      name: 'ActionFigure',
      component: ActionFigure
    }
  ]
})
