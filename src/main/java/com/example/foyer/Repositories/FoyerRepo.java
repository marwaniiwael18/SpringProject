package com.example.foyer.Repositories;

import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Foyer;
import com.example.foyer.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoyerRepo extends JpaRepository<Foyer, Integer> {

//    List<Bloc> findFoyerByBlocAndUniversite(int universite);
}
