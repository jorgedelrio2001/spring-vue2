//import AdminLogin from "./pages/AdminLogin.vue";

const ExamplePage = () => import(/* webpackChunkName: "example" */ './pages/ExamplePage.vue');
const AdminLogin = () => import(/* webpackChunkName: "admin" */ './pages/AdminLogin.vue');

export default [
    {
        name: 'ExamplePage',
        path: '/example-page',
        component: ExamplePage,
    },

    {
        name:'AdminLogin',
            path: '/admin-login',
        component: AdminLogin,
    }
];