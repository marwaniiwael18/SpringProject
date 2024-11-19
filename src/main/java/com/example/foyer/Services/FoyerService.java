package com.example.foyer.Services;


import com.example.foyer.Repositories.BlocRepo;
import com.example.foyer.Repositories.FoyerRepo;
import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.ListResourceBundle;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    FoyerRepo foyerRepo;
    BlocRepo blocRepo;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepo.findAll();
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public void deleteFoyer(Foyer foyer) {
        foyerRepo.delete(foyer);
    }

    @Override
    public Foyer getFoyerById(int id) {
        return foyerRepo.findById(id).get();
    }

    @Override
    public void assignBlocToFoyer( int idBloc, int idFoyer) {
        Bloc bloc = blocRepo.findById(idBloc).get();
        Foyer foyer = foyerRepo.findById(idFoyer).get();
        bloc.setFoyer(foyer);
        blocRepo.save(bloc);
    }

}
