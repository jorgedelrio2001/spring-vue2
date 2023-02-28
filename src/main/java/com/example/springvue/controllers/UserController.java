
package com.example.springvue.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController { public static void main(String[] args){
        // Load the Firebase Admin SDK configuration
           //Inside file input stream immediately below put the name of your credentials file
       //     FileInputStream serviceAccount = new FileInputStream("C:\\Users\\User\\zer\\adiam.json");
            /*BufferedReader bf= new BufferedReader(new InputStreamReader(serviceAccount));
            int i=0;
            while(bf.ready()){
                System.out.print(i+":");
                i++;
                System.out.println(bf.readLine());
            } //Use this thing to check that your file is reading....*/


        //HashMap map= new HashMap<String,String>();
        //map.put("Oh","no");


        /*FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();


        FirebaseApp firebaseApp= FirebaseApp.initializeApp(options);

       // System.out.print(firestoreOptions);

        //System.out.print(db.collection("funeral homes").add(map)==null);
        //System.out.print(db==null);
        */
    }
}
