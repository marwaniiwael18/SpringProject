package com.example.foyer.Services;


import com.example.foyer.Repositories.FoyerRepo;
import com.example.foyer.Repositories.UniversiteRepo;
import com.example.foyer.entities.Foyer;
import com.example.foyer.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

    UniversiteRepo universiteRepo;
    FoyerRepo foyerRepo;


    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepo.save(universite);
    }

    @Override
    public void deleteUniversite(Universite universite) {
        universiteRepo.delete(universite);
    }

    @Override
    public Universite getUniversiteById(int id) {
        return universiteRepo.findById(id).get();
    }

    @Override
    public Universite affecterFoyerToUniversite(Universite universite){
        return universiteRepo.save(universite);
    }

    @Override
    public Universite affecterFoyerToUniversite( int idUniversite, Foyer foyer){
        Universite universite = universiteRepo.findById(idUniversite).get();
        Foyer foyer1 = foyerRepo.save(foyer);
        universite.setFoyer(foyer1);
        universiteRepo.save(universite);
        return universite;
    }

    @Override
    public Universite DesaffecterFoyerFromUniversite(int universiteId){
        Universite universite = universiteRepo.findById(universiteId).get();
        universite.setFoyer(null);
        universiteRepo.save(universite);
        return universite;
    }
}
