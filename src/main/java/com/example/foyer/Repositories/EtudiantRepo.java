package com.example.foyer.Repositories;

import com.example.foyer.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {

    Etudiant findEtudiantByCin(Long Cin );

}

