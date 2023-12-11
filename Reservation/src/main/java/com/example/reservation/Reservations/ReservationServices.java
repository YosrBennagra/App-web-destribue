package com.example.reservation.Reservations;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServices implements IService {
ReservationRepo resrvationRepository;
    @Override
    public Reservation AjouterReservation(Reservation r) {
        return resrvationRepository.save(r);
    }

    @Override
    public Reservation UpdateReservation(Reservation r) {
        return resrvationRepository.save(r);
    }


    @Override
    public void SupprimerReservation(Long idReservation) {
        resrvationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation GetReservation(Long idReservation) {
        return resrvationRepository.findById( idReservation).orElse(null);
    }

    @Override
    public List<Reservation> GetAllReservation() {
        return resrvationRepository.findAll();
    }
    @Override
    public Reservation GetAllReservationByidEtudiantAndIdChambre(Long idC,Long idE){
        return resrvationRepository.findByIdChambreAndIdEtudiant(idC,idE);
    }
    @Override
    public List<Reservation> findByIdEtudiant(Long id){
        return resrvationRepository.findByIdEtudiant(id);
    }

}
