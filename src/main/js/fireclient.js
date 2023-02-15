import { initializeApp } from "firebase/app";
import "firebase/auth";
import "firebase/firebase-firestore"

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
// these are credentials that the user will need to send in order to talk to our database
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


const firebaseApp=initializeApp(firebaseConfig);
const authoritah=firebaseApp.auth();
const firestore=firebaseApp.firestore();

//authoritah.createUserWithEmailAndPassword("creativedan2@gmail.com","uber");
/*firestore.collection('funeral homes').doc('FH').update('fhname','epic funeral home')
firestore.collectionGroup('funeral homes ' )*/

authoritah.createUserWithEmailAndPassword("creativedan2@gmail.com","superepicawesomecool")
    .then((userCredential) => {
        // Signed in
        const user = userCredential.user;
        console.log(user);
        // ...
    })
    .catch((error) => {
        const errorCode = error.code;
        const errorMessage = error.message;
        // ..
    });

authoritah.onAuthStateChanged( user=>{
    if(user != null){
        console.log('logged in!')
    }
    else{
        console.log('No user :(')
    }
})
//export const db = base.firestore();
//^^^^The code will give us a little bit of hope that firebase wont be a pain in the neck any longer
//DB set-up should be easy
