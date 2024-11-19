package com.example.foyer.Repositories;

import com.example.foyer.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
}
