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
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idBloc;
    String nomBloc;
    int capaciteBloc;

    @ManyToOne
    @JsonIgnore
    private Foyer foyer;
// l cardinalité la plus faible lel fils
//hedha l fils puisque fama l mapped by
// l cascade bech l'affectation tsir / fel unidrectionnelle : elli ychouf howa li aandou l cascade
//      exp : (universite -> foyer) fel universite nhotou l cascade
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "bloc" )
    private List<Chambre> chambres;
}
