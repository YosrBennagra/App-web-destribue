package com.example.reservation.Reservations;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Setter
@Getter
public class Reservation {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long idReservation;
        private String numReservation;
        private LocalDate DebUniversitaire;
        private LocalDate FinUniversitaire;
        private boolean estvalide;
        private String description;
        private String email;
        private String phone;
        @Enumerated(EnumType.STRING)
        @Column(name = "etat_reservation")
        private EtatReservation etatReservation;
        @Enumerated(EnumType.STRING)
        @Column(name = "type_payment")
        private TypePayment typePayment;
        @Enumerated(EnumType.STRING)
        @Column(name = "type_repas")
        private TypeRepas typeRepas;
        private Long idEtudiant;
        private Long idChambre;

}
