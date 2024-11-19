package com.example.foyer.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    private Foyer foyer;
}
