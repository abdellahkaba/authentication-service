package com.kaba.securityservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "avis")
public class Avis {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String message ;
    private String status ;
}
