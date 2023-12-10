package com.example.foyer;

import lombok.RequiredArgsConstructor;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;

import java.util.List;
@RequiredArgsConstructor
@RequestMapping("/foyer")
@RestController
public class FoyerRestController {

    private final FoyerService   foyerService;
    @GetMapping("/Allfoyer")
    @RequestMapping(value = "/user")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<List<Foyer>> getAllFoyer(KeycloakAuthenticationToken auth) {
        KeycloakPrincipal<KeycloakSecurityContext> principal = (KeycloakPrincipal<KeycloakSecurityContext>) auth.getPrincipal();
        KeycloakSecurityContext context = principal.getKeycloakSecurityContext();
        boolean hasUserRole = context.getToken().getRealmAccess().isUserInRole("user");

        if (hasUserRole) {
            return new ResponseEntity<>(foyerService.GetAllfoyer(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

    }


    @GetMapping("/Allfoyer2")
    public List<Foyer> getAllFoyer2() {
       return foyerService.GetAllfoyer();
    }



    @PostMapping("/addfoyer") // ajouter
    //@ResponseBody
    public Foyer AddFoyer(@RequestBody Foyer f) {
        return foyerService.Ajouterfoyer(f);
    }
    @DeleteMapping("/deletefoyer/{id}")
    public void Supprimerfoyer(@PathVariable Long id) {
        foyerService.SupprimeFoyer(id);
    }
    @PutMapping("/update")
    public Foyer ModifierFoyer( @RequestBody Foyer f) {
        return foyerService.Updatefoyer(f);
    }

    @GetMapping("/getfoyer/{id}")
    public Foyer getfoyerByid(@PathVariable long id){
        return foyerService.Getfoyer(id);
    }
}
