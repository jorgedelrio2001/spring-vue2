package com.example.springvue.controllers;

import com.example.springvue.controllers.service.FirebaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirebaseController {

    private final FirebaseService firebaseService;

    public FirebaseController(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }

    @GetMapping("/data")
    public ResponseEntity<?> getAllData() {
        DatabaseReference ref = firebaseService.getDatabase().getReference("data");
        // TODO: Retrieve data from Firebase Realtime Database reference
        return ResponseEntity.ok().build();
    }
}
