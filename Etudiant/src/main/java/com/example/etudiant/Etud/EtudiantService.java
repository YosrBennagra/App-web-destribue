package com.example.etudiant.Etud;

import com.example.etudiant.Etud.Etudiant;
import com.example.etudiant.Etud.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService {


   EtudiantRepo etudiantRepository;

    public Etudiant AjouterEtudiantAPI(Etudiant e) {



           return etudiantRepository.save(e);

    }


    public Etudiant UpdateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }


    public void SupprimerEtdiant(long idEtudiant) {

        etudiantRepository.deleteById( idEtudiant);

    }


    public Etudiant GetEtudiant(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }


    public List<Etudiant> GetAllEtudiant() {
        return etudiantRepository.findAll();
    }

}
