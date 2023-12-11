package com.example.reservation.Reservations;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepo extends JpaRepository<Reservation,Long> {
    Reservation findByIdChambreAndIdEtudiant(Long idChambre, Long idEtudiant);

    List<Reservation> findByIdEtudiant(Long idEtudiant);

}
