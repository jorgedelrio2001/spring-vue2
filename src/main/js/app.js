import Vue from 'vue';
import VueRouter from 'vue-router';
import axios from 'axios';
import App from './components/App.vue';
import routes from './routes';
import store from './store';
import ticket from './super';
import { initializeApp } from "firebase/app";

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
    apiKey: "AIzaSyCbuK5yf4uAur4qpjQcDmdVbwdgicFfCew",
    authDomain: "sp23-bcfc0.firebaseapp.com",
    databaseURL: "https://sp23-bcfc0-default-rtdb.firebaseio.com",
    projectId: "sp23-bcfc0",
    storageBucket: "sp23-bcfc0.appspot.com",
    messagingSenderId: "412407040780",
    appId: "1:412407040780:web:435c300905b10d21495729",
    measurementId: "G-P3VXXSRQXZ"
};

const base=initializeApp(firebaseConfig);

export const db = base.firestore();




Vue.use(VueRouter);

export const router = new VueRouter({
    mode: 'history',
    base: '/',
    linkActiveClass: 'is-active',
    routes,
});

document.addEventListener('DOMContentLoaded', () => {
    new Vue({
        router,
        store,
        render: (h) => h(App),
    }).$mount('#app');
});