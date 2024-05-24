package com.kaba.authenticationservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/demo")
public class Democontroller {

    @GetMapping("")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("Hello the word") ;
    }

}
