package com.htw.berlin.service;

import com.htw.berlin.model.Petition;
import com.htw.berlin.repository.PetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetitionService {

    @Autowired
    PetitionRepository petitionRepository;

    public Petition save(Petition petition){
       return petitionRepository.save(petition);
    }

    public Petition getPetitionById (Long Id){
        return  petitionRepository.findById(Id).orElseThrow();
    }

    public void deletePetitionById (Long Id, Long userId){
        Petition petition = getPetitionById(Id);
        if(petition.getUserId() == userId)
            petitionRepository.deleteById(Id);
    }

    public  List<Petition> getUserPetition(String userId){
        return petitionRepository.getPetitionUser(userId);
    }
    public List<Petition> getPetitions(){
        return (List<Petition>) petitionRepository.findAll();
    }
}
