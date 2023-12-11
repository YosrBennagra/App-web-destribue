package com.example.chambre.Chambres;

import com.example.chambre.Chambres.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findByIdBloc(Long idBloc);
}
