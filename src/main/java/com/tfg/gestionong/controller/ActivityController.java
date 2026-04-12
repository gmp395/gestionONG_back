package com.tfg.gestionong.controller;

import com.tfg.gestionong.model.Activity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class ActivityController {
    public ResponseEntity<Boolean> createActivity(Activity activityToCreate) {
        return ResponseEntity.ok(true);
    }
}
