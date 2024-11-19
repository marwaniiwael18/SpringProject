package com.example.foyer.Services;

import com.example.foyer.Repositories.ChambreRepo;
import com.example.foyer.entities.Chambre;

import com.example.foyer.entities.TypeChambre;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ChambreServiceImp implements IChambreService{

    ChambreRepo chambreRepository;


    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre getChambreById(int idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Chambre chambre) {
        chambreRepository.delete(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public void deleteChambreById(int idChambre) {
        chambreRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> recupererListChambre(int idBloc , TypeChambre typeChambre){
        return chambreRepository.findChambreByBloc_IdBlocAndTypeC(idBloc, typeChambre);
    }
}
