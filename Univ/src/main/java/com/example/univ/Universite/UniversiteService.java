package com.example.univ.Universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class UniversiteService {

    private final UniversiteRepository univerRepo;

    public Universite ajouterUniversite(Universite u) {
        return univerRepo.save(u);
    }

    public Universite updateUniversite(Universite u) {
        return univerRepo.save(u);
    }


    public void supprimerUniversite(long idUniversite) {
        univerRepo.deleteById(idUniversite);
    }

    public Universite getUniversite(long idUniversite) {
        return univerRepo.findById(idUniversite).orElse(null);
    }

    public List<Universite> getAllUniversite() {
        return (List<Universite>) univerRepo.findAll();
    }
}
