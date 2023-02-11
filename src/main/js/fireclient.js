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
//^^^^Okay, so This code doesn't crash, but when I put it in app.js, pages don't load ::: So basically a soft crash
//im going to look further into how to use this thing