const ExamplePage = () => import(/* webpackChunkName: "example" */ './pages/ExamplePage.vue');
import LandingPage from "./pages/LandingPage.vue";

export default [
    {
        name: 'ExamplePage',
        path: '/example-page',
        component: ExamplePage,
    },
    {
        name:'LandingPage',
        path:'/welcome',
        component:LandingPage,
    },
];