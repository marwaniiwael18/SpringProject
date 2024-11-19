package com.example.foyer.Services;


import com.example.foyer.entities.Etudiant;


import java.util.List;


public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);

    Etudiant getEtudiantById(int idEtudiant);

    Etudiant updateEtudiant(Etudiant etudiant);
    Etudiant findEtudiantByCin(Long Cin );


    void deleteEtudiant(Etudiant etudiant);

    List<Etudiant> getAllEtudiant();
}