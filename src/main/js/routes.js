

const ExamplePage = () => import(/* webpackChunkName: "example" */ './pages/ExamplePage.vue');
import LandingPage from "./pages/LandingPage.vue";
const JeremiahPage = () => import(/* webpackChunkName: "example" */ './pages/JeremiahPage.vue');
const VideoPage=()=>import('./pages/VideoPage.vue');
//make a const with the name of ur vue file
//you'll need it further down this file

    // import VideoPage from "./pages/VideoPage.vue";   <--- This also works, I'm wondering if const is safer?


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
    {
        name: 'JeremiahPage',
        path: '/admin',
        component: JeremiahPage,
    },
    {
        name:'VideoPage',
        path:'/video-page',
        component:VideoPage,
    },
];
//In addition to the config stuff *see config/SecurityConfig* You need to add your vue page to the routes.js file
//just add a comma "," and then make an object {} with 3 attributes, "name, path & component" name will be the
// "Export" name of ur view file
//path is the path you set up in your controller, which will bne the same as the path you set up in Security config
//component will be the name of the import you made earlier


