package com.example.springvue.controllers;

import com.google.api.client.json.JsonString;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class UserController {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        // Load the Firebase Admin SDK configuration
           //Inside file input stream immediately below put the name of your credentials file
            FileInputStream serviceAccount = new FileInputStream("C:\\Users\\User\\zer\\adiam.json");
            /*BufferedReader bf= new BufferedReader(new InputStreamReader(serviceAccount));
            int i=0;
            while(bf.ready()){
                System.out.print(i+":");
                i++;
                System.out.println(bf.readLine());
            } //Use this thing to check that your file is reading....*/


        //HashMap map= new HashMap<String,String>();
        //map.put("Oh","no");


        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();


        FirebaseApp firebaseApp= FirebaseApp.initializeApp(options);

       // System.out.print(firestoreOptions);

        //System.out.print(db.collection("funeral homes").add(map)==null);
        //System.out.print(db==null);

    }
}
