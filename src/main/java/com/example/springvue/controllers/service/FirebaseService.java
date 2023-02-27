package com.example.springvue.controllers.service;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    //Not properly allocated since not all components are set yet
    //private final FirebaseDatabase database;

    /*public FirebaseService(FirebaseApp firebaseApp) {
        this.database = FirebaseDatabase.getInstance(firebaseApp);
    }*/

    public FirebaseDatabase getDatabase() {
        //nothing here yet, so I just returned null so that the code doesn't break in compile time
        return null;
    }

    // TODO: Implement database operations
}
