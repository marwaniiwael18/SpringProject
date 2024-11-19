package com.example.foyer.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Entity
@Getter
@Setter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEtudiant;
    String nom;
    String prenom;
    int cin;
    String ecole;
    Date dateNaissance;

    @ManyToMany( mappedBy = "etudiants")
    @JsonIgnore
    private List<Reservation> reservations;
}
