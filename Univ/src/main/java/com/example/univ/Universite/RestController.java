package com.example.univ.Universite;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/universite")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final UniversiteService universiteService;
    @GetMapping("/all")
    public List<Universite> getAllUniversite(){
        return universiteService.getAllUniversite();
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u){
        return universiteService.ajouterUniversite(u);
    }

    @PostMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u){
        return universiteService.updateUniversite(u);
    }

    @DeleteMapping("/delete/{idUniversite}")
    public void deleteUniversite(@PathVariable Long idUniversite){
        universiteService.supprimerUniversite(idUniversite);
    }

}
