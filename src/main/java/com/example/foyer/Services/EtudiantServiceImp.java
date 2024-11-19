package com.example.foyer.Services;

import com.example.foyer.Repositories.EtudiantRepo;

import com.example.foyer.entities.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
    EtudiantRepo etudiantRepository;


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiantById(int idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant findEtudiantByCin(Long Cin) {
        return etudiantRepository.findEtudiantByCin(Cin);
    }

    @Override
    public void deleteEtudiant(Etudiant etudiant) {
        etudiantRepository.delete(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }
}
