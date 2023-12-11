package com.example.etudiant.Etud;

import com.example.etudiant.Etud.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
}
