package com.example.bloc.Blocs;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocService {
    BlocRepo blocRepository;


    public Bloc AjouterBloc(Bloc b) {
        return blocRepository.save(b) ;
    }


    public Bloc UpdateBloc(Bloc b) {
        return blocRepository.save(b);
    }


    public void SupprimerBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }


    public Bloc GetBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }


    public List<Bloc> GetAllBlocs() {
        return blocRepository.findAll();
    }

    public List<Bloc> getBlocByIdFoyer(long idFoyer){return blocRepository.findByIdFoyer(idFoyer);}
}
