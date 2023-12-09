package com.example.chambre.Chambres;

import com.example.chambre.Chambres.Chambre;
import com.example.chambre.Chambres.ChambreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j

@Service
@AllArgsConstructor
public class ChambreServices {
    ChambreRepository chambreRepository;


    public Chambre AjoutChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    public Chambre UpdateChambre(Chambre c) {
        return chambreRepository.save(c);
    }


    public void SupprimerChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }


    public Chambre GetChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }


    public List<Chambre> GetAllChambres() {
        return chambreRepository.findAll();
    }

}
