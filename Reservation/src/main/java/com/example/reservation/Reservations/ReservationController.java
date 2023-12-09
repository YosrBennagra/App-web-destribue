package com.example.reservation.Reservations;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Reservation")
@RestController
public class ReservationController {
    final public ReservationServices reservationService;
    @GetMapping("/ALLReservation")
    public List<Reservation> getAllReservation(){return reservationService.GetAllReservation();}
    @PostMapping("/addReservation")
    public Reservation Addbloc(@RequestBody Reservation r){return reservationService.AjouterReservation(r);}
    @DeleteMapping("/deleteReservation/{id}")
    public void Deletefoyer(@PathVariable long id){

        reservationService.SupprimerReservation(id);}

    @PutMapping("/UpdateReservation")
    public Reservation MOdifierBlocs(@RequestBody Reservation r)
    {
        return reservationService.UpdateReservation(r);
    }
}
