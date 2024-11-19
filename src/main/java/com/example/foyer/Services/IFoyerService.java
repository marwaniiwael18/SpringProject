package com.example.foyer.Services;

import com.example.foyer.entities.Bloc;
import com.example.foyer.entities.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addFoyer(Foyer foyer);

    List<Foyer> getAllFoyers();

    Foyer updateFoyer(Foyer foyer);

    void deleteFoyer(Foyer foyer);

    Foyer getFoyerById(int id);

    void assignBlocToFoyer( int idBloc, int idFoyer) ;
}
