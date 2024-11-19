package com.example.foyer.Services;

import com.example.foyer.entities.Foyer;
import com.example.foyer.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    Universite addUniversite(Universite universite);

    List<Universite> getAllUniversites();

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Universite universite);

    Universite getUniversiteById(int id);

    Universite affecterFoyerToUniversite( Universite universite);

    Universite affecterFoyerToUniversite( int idUniversite, Foyer foyer);

    Universite DesaffecterFoyerFromUniversite(int UniversiteId) ;
}
