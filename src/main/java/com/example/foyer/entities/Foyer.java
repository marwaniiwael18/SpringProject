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
    public class Foyer implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idFoyer;
        String nomFoyer;
        int capaciteFoyer;

        @OneToOne(mappedBy = "foyer")
        @JsonIgnore
        private Universite universite;
//hedha l fils puisque fama l mapped by
        @OneToMany(cascade = CascadeType.ALL , mappedBy = "foyer")
        private List<Bloc> bloc;
    }
