package com.example.foyer;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // edhy constructeur maa final

public class FoyerService {
    final  FoyerRepository foyerRepository;

    public Foyer Ajouterfoyer(Foyer f) {
        System.out.println(f);
        return foyerRepository.save(f);
    }



    public Foyer Updatefoyer(Foyer f) {
        return foyerRepository.save(f);
    }


    public void SupprimeFoyer(long idfoyer) {
        foyerRepository.deleteById(idfoyer);

    }


    public Foyer Getfoyer(long idfoyer) {
        return foyerRepository.findById(idfoyer).orElse(null); // ki nheb manwagfech probleme
        //        return foyerRepository.findById(idfoyer).get(); kan lgee object yraj3ou kan malgech exception
    }

    public List<Foyer> GetAllfoyer() {
        return foyerRepository.findAll();
    }


































}
