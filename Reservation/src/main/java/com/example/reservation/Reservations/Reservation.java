package com.example.reservation.Reservations;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@Setter
@Getter
public class Reservation {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)

        private long idReservation;
        private String numReservation;
        private LocalDate DebUniversitaire;
        private LocalDate FinUniversitaire;
        private boolean estvalide;
}
