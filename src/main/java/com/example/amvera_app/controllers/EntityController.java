package com.example.amvera_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    @GetMapping("/app")
    public String app() {
        return "Hi";
    }
}
