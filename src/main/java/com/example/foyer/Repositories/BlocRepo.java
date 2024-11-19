package com.example.foyer.Repositories;

import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepo extends JpaRepository<Bloc, Integer> {
    List<Bloc> findByFoyer_Universite_IdUniversite(int universite);
    //findByFoyerUniversite_IdUniversite

}
