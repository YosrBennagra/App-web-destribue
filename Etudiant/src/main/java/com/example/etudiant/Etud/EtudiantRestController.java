package com.example.etudiant.Etud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RequestMapping("/Etudiant")
@RestController
public class EtudiantRestController {


    private final EtudiantService etudiantService;
    @GetMapping("/Alletudiant")
    public List<Etudiant> GetAlletudnat(){return etudiantService.GetAllEtudiant();}
    @PostMapping("/AddEtudiant")
    public Etudiant AddEtudiant(@RequestBody Etudiant e){
        return etudiantService.AjouterEtudiantAPI(e);
    }
    @PutMapping("/UpdateEtudiant")
    public Etudiant UpdateEtudiant(@RequestBody Etudiant e){
        return etudiantService.UpdateEtudiant(e);
    }
    @DeleteMapping("/delete/{id}")
    public void SupprimerChambre(@PathVariable long id){
        etudiantService.SupprimerEtdiant(id);}
}
