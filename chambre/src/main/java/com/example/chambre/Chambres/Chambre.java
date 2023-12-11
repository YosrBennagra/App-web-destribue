package com.example.chambre.Chambres;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Chambre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idChambre;
    private long numchambre;

}
