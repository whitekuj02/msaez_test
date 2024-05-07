
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InHelloHelloManager from "./components/listers/InHelloHelloCards"
import InHelloHelloDetail from "./components/listers/InHelloHelloDetail"

import OutHelloWorldManager from "./components/listers/OutHelloWorldCards"
import OutHelloWorldDetail from "./components/listers/OutHelloWorldDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inHellos/hellos',
                name: 'InHelloHelloManager',
                component: InHelloHelloManager
            },
            {
                path: '/inHellos/hellos/:id',
                name: 'InHelloHelloDetail',
                component: InHelloHelloDetail
            },

            {
                path: '/outHellos/worlds',
                name: 'OutHelloWorldManager',
                component: OutHelloWorldManager
            },
            {
                path: '/outHellos/worlds/:id',
                name: 'OutHelloWorldDetail',
                component: OutHelloWorldDetail
            },



    ]
})
