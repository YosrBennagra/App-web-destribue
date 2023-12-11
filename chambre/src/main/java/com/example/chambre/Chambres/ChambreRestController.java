package com.example.chambre.Chambres;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/Chambre")
@RestController
public class ChambreRestController {
    private final ChambreServices chambreService;

    @GetMapping("/GetAllChambre")
    public List<Chambre> GetAllChambre(){return chambreService.GetAllChambres();}
    @PostMapping("/Addchambre")
    public Chambre AjoutChambre(@RequestBody Chambre c){
        return chambreService.AjoutChambre(c);
    }
    @PutMapping("/Update")
    public Chambre Updatechambre(@RequestBody Chambre c ){
        return chambreService.UpdateChambre(c);
    }
    @DeleteMapping("/deleteChambre/{id}")
    public void SupprimerChambre(@PathVariable long id){
        chambreService.SupprimerChambre(id);
    }
}
