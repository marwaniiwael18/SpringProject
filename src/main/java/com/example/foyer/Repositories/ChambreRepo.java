package com.example.foyer.Repositories;

import com.example.foyer.entities.Chambre;
import com.example.foyer.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepo extends JpaRepository<Chambre, Integer> {
    List<Chambre> findChambreByBloc_IdBlocAndTypeC(int bloc , TypeChambre typeChambre);
}

