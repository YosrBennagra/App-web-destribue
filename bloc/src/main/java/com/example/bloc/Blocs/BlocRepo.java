package com.example.bloc.Blocs;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepo extends JpaRepository<Bloc,Long> {
    List < Bloc > findByIdFoyer (Long idFoyer);

}
