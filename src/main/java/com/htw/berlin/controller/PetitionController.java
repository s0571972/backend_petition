package com.htw.berlin.controller;

import com.htw.berlin.service.PetitionService;
import com.htw.berlin.model.Petition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
    @CrossOrigin
    public Petition createPetition(@RequestBody Petition petition){
        return  petitionService.save(petition);
    }

    @GetMapping("/petitions")
    @CrossOrigin
    public List<Petition> getPetitions(){
        return petitionService.getPetitions();
    }
    @GetMapping("/petitions/{userId}")
    @CrossOrigin
    public List<Petition> getUserPetitions(@PathVariable String userId){
        return petitionService.getUserPetition(userId);
    }

    @DeleteMapping("/petition/{id}/user/{userId}")
    @CrossOrigin
    public void deletePetition(@PathVariable String id, @PathVariable String userId){
        Long petitionId = Long.parseLong(id);
        Long petitionUserId = Long.parseLong(userId);
        petitionService.deletePetitionById(petitionId, petitionUserId);
    }

    @GetMapping("/petition/{id}")
    public Petition getPetition(@PathVariable String id){
        Long petitionId = Long.parseLong(id);
        return  petitionService.getPetitionById(petitionId);
    }
}
