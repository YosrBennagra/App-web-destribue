package com.example.reservation.Reservations;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Reservation")
@RestController
@CrossOrigin("*")
public class ReservationController {
    final public IService reservationService;
    @GetMapping("/ALLReservation")
    public List<Reservation> getAllReservation(){return reservationService.GetAllReservation();}
    @PostMapping("/addReservation")
    public Reservation Addbloc(@RequestBody Reservation r){return reservationService.AjouterReservation(r);}
    @PostMapping("/deleteReservation/{id}")
    public void Deletefoyer(@PathVariable long id){reservationService.SupprimerReservation(id);}
    @PutMapping("/UpdateReservation")
    public Reservation MOdifierBlocs(@RequestBody Reservation r) {return reservationService.UpdateReservation(r);}
    @GetMapping("/byIdEtudiantAndIdChambre/{idC}/{idE}")
    public Reservation getAllReservationByidEtudiantAndIdChambre(@PathVariable Long idC, @PathVariable Long idE) {return reservationService.GetAllReservationByidEtudiantAndIdChambre(idC, idE);}
    @GetMapping("/byIdEtudiant/{id}")
    public List<Reservation> findByIdEtudiant(@PathVariable Long id) {return reservationService.findByIdEtudiant(id);}
    @GetMapping("/{idReservation}")
    public Reservation getReservationById(@PathVariable Long idReservation) {
        return reservationService.GetReservation(idReservation);
    }
}
