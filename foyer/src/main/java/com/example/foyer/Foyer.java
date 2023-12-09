package com.example.foyer;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long idFoyer;


    private String nomFoyer;
    private Long capaciteFoyer;
}
