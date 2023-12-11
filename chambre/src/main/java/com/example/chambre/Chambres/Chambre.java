package com.example.chambre.Chambres;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Chambre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idChambre;
    private Long numchambre;
    private Long idBloc;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

}
