package com.example.foyer.Services;

import com.example.foyer.Repositories.EtudiantRepo;
import com.example.foyer.Repositories.ReservationRepo;
import com.example.foyer.entities.Etudiant;
import com.example.foyer.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements IReservationService {

    ReservationRepo reservationRepository;
    EtudiantRepo etudiantRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(int idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation affecterEtudiantToReservation( String idREservation, int idEtudiant){
        Reservation  reservation = getReservationById(Integer.valueOf(idREservation));
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).get();
        List<Etudiant> etudiants = reservation.getEtudiants();
        etudiants = new ArrayList<>();
        if (!etudiants.contains(etudiant)) {
            etudiants.add(etudiant);
        }
        reservation.setEtudiants(etudiants);
        return reservationRepository.save(reservation);
    }

    @Override
    public void desaffecterEtudiantFromReservation(String reservationId, int etudiantId) {
        Reservation reservation = getReservationById(Integer.valueOf(reservationId));
        Etudiant etudiant = etudiantRepository.findById(etudiantId).get();
        reservation.getEtudiants().remove(etudiant);
        reservationRepository.save(reservation);
    }

}
