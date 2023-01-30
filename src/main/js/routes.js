import VideoPage from "./pages/VideoPage.vue";

const ExamplePage = () => import(/* webpackChunkName: "example" */ './pages/ExamplePage.vue');
//const VideoPage=()=>import('./pages/VideoPage.vue');
export default [
    {
        name: 'ExamplePage',
        path: '/example-page',
        component: ExamplePage,
    },
    {
        name:'VideoPage',
        path:'/video-page',
        component:VideoPage,
    }

];
//In addition to the config stuff *see config/SecurityConfig* You need to add your vue page to the routes.js file
//just add a comma "," and then make an object {} with 3 attributes, "name, path & component" name will be the
// "Export" name of ur view file
//path is the path you set up in your controller, which will bne the same as the path you set up in Security config
//component should be the name of your static page template in *templates*


