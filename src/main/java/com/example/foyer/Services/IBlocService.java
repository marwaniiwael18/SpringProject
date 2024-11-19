package com.example.foyer.Services;

import com.example.foyer.entities.Bloc;


import java.util.List;


public interface IBlocService {
    Bloc addBloc(Bloc bloc);

    Bloc getBlocById(int idBloc);

    Bloc updateBloc(Bloc bloc);

    void deleteBloc(Bloc bloc);

    List<Bloc> getAllBloc();

    Bloc ajouterBlocEtChambresAssocie(Bloc bloc);

    List<Bloc> getBlocByUniversite(int idUniversite);
}
