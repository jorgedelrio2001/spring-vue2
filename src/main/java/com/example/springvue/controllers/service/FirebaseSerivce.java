package com.example.springvue.controllers.service;

import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    private final FirebaseDatabase database;

    public FirebaseService(FirebaseApp firebaseApp) {
        this.database = FirebaseDatabase.getInstance(firebaseApp);
    }

    // TODO: Implement database operations
}
