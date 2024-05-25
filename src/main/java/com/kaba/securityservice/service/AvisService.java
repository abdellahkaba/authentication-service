package com.kaba.securityservice.service;

import com.kaba.securityservice.entities.Avis;
import com.kaba.securityservice.repository.AvisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class AvisService {
    private final AvisRepository avisRepository ;
    public void create(Avis avis){
        avisRepository.save(avis) ;
    }
}
