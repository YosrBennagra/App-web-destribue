package com.example.bloc.Blocs;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    @Column(unique = true)
    private String nomBloc;
    private Long capaciteBloc;

    private Long idFoyer;

}
