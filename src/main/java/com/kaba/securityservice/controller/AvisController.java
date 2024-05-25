package com.kaba.securityservice.controller;

import com.kaba.securityservice.entities.Avis;
import com.kaba.securityservice.service.AvisService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("avis")
public class AvisController {
    private final AvisService avisService ;


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Avis avis) {
        avisService.create(avis);
    }
}
