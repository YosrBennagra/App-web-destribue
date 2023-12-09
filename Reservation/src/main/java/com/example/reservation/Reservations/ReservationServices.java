package com.example.reservation.Reservations;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServices {
ReservationRepo resrvationRepository;

    public Reservation AjouterReservation(Reservation r) {
        return resrvationRepository.save(r);
    }


    public Reservation UpdateReservation(Reservation r) {
        return resrvationRepository.save(r);
    }


    public void SupprimerReservation(long idReservation) {
        resrvationRepository.deleteById( idReservation);
    }


    public Reservation GetReservation(long idReservation) {
        return resrvationRepository.findById( idReservation).orElse(null);
    }


    public List<Reservation> GetAllReservation() {
        return resrvationRepository.findAll();
    }

}
