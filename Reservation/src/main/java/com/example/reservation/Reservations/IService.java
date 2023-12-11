package com.example.reservation.Reservations;

import java.util.List;

public interface IService {
    public Reservation AjouterReservation(Reservation r);

    public Reservation UpdateReservation(Reservation r);

    public void SupprimerReservation(Long idReservation);

    public Reservation GetReservation(Long idReservation);

    public List<Reservation> GetAllReservation();

    public Reservation GetAllReservationByidEtudiantAndIdChambre(Long idC, Long idE);
    public List<Reservation> findByIdEtudiant(Long id);
}