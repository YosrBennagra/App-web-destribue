package com.example.bloc.Blocs;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/bloc")
@RestController

public class BlocController {
    private final BlocService blocService;
    @GetMapping("/Allblocs")
    public List<Bloc> getAllbloc(){return blocService.GetAllBlocs();}
    @PostMapping("addblocs")
    public Bloc Addbloc(@RequestBody Bloc b){return blocService.AjouterBloc(b);}
    @DeleteMapping("deletebloc/{id}")
    public void Deletefoyer(@PathVariable long id){
        System.out.println("tfaskh");
        blocService.SupprimerBloc(id);}

    @PutMapping("Updatebloc")
    public Bloc MOdifierBlocs(@RequestBody Bloc b)
    {
        return blocService.UpdateBloc(b);
    }

    @GetMapping("bloc/{id}")
    public List<Bloc> getBlocByIdFoyer(@PathVariable long id){return blocService.getBlocByIdFoyer(id);}

}
