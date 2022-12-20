package com.htw.berlin.controller;

import com.htw.berlin.service.PetitionService;
import com.htw.berlin.model.Petition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class PetitionController {

    @Autowired
    PetitionService petitionService;

    @PostMapping("/petition")
    public Petition createPetition(@RequestBody Petition petition){
        return  petitionService.save(petition);
    }

    @GetMapping("/petitions")
    @CrossOrigin
    public List<Petition> getPetitions(){
        return petitionService.getPetitions();
    }

    @DeleteMapping("/petition/{id}")
    public void deletePetition(@PathVariable String id){
        Long petitionId = Long.parseLong(id);
        petitionService.deletePetitionById(petitionId);
    }

    @GetMapping("/petition/{id}")
    public Petition getPetition(@PathVariable String id){
        Long petitionId = Long.parseLong(id);
        return  petitionService.getPetitionById(petitionId);
    }
}
