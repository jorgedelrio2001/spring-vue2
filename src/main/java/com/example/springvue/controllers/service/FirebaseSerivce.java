package com.example.springvue.controllers.service;

import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    //Not properly allocated since not all components are set yet
    private final FirebaseDatabase database;

    public FirebaseService(FirebaseApp firebaseApp) {
        this.database = FirebaseDatabase.getInstance(firebaseApp);
    }

    // TODO: Implement database operations
}
