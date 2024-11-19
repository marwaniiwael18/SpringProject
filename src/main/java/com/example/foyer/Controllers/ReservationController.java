package com.example.foyer.Controllers;


import com.example.foyer.Services.IReservationService;
import com.example.foyer.entities.Reservation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("api/reservations")
@Tag(name = "Gestion Réservation", description = "API for managing Reservations")
public class ReservationController {
    IReservationService reservationService;

    @PostMapping()
    @Operation(summary = "Add a new Reservation", description = "Creates a new Reservation and returns the created object.")
    public Reservation ajoutReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("{idReservation}")
    @Operation(summary = "Get Reservation by ID", description = "Retrieves a Reservation by its ID.")
    public Reservation getReservation(@PathVariable("idReservation") String idReservation) {
        return reservationService.getReservationById(Integer.valueOf(idReservation));
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Reservation", description = "Deletes a Reservation based on the provided Reservation object.")
    public void deleteReservation(@RequestBody Reservation reservation) {
        reservationService.deleteReservation(reservation);
    }

    @PutMapping()
    @Operation(summary = "Update a Reservation", description = "Updates an existing Reservation and returns the updated object.")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @GetMapping()
    @Operation(summary = "Get all Reservations", description = "Retrieves a list of all Reservations.")
    public List<Reservation> getAllReservation() {
        return reservationService.getAllReservation();
    }

    @PutMapping("affecterEtudiantToReservation/{idReservation}/{idEtudiant}")
    public Reservation affecterEtudiantToReservation(@PathVariable ("idReservation") String idReservation, @PathVariable ("idEtudiant") int idEtudiant) {
        return reservationService.affecterEtudiantToReservation(idReservation , idEtudiant);
    }

    @PutMapping("desaffecterEtudiantFromReservation/{reservationId}/{etudiantId}")
    public void desaffecterEtudiantFromReservation(@PathVariable ("reservationId") String reservationId, @PathVariable ("etudiantId") int etudiantId) {
        reservationService.desaffecterEtudiantFromReservation(reservationId , etudiantId);
    }

}

