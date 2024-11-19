package com.example.foyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.*;


@Entity
@Getter
@Setter
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idChambre;

    int nombreChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne
    @JsonIgnore
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;
}
