package com.htw.berlin.service;

import com.htw.berlin.model.Petition;
import com.htw.berlin.model.UserPetitionPetition;
import com.htw.berlin.repository.UserPetitionPetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPetitionPetitionService {
    @Autowired
    UserPetitionPetitionRepository userSignPetitionRepository;

    public UserPetitionPetition save(UserPetitionPetition userPetitionPetition){
        return userSignPetitionRepository.save(userPetitionPetition);
    }

    @Query
    public List<UserPetitionPetition> getUserPetitionPetitions(Petition petition){
        return (List<UserPetitionPetition>) userSignPetitionRepository.getUserPetitionPetitionByPetition(petition);
    }

    @Query
    public List<UserPetitionPetition> getUserPetitionPetitions(){
        return (List<UserPetitionPetition>) userSignPetitionRepository.findAll();
    }

    @Query
    public UserPetitionPetition getUserPetitionPetitionsById(Long id){
        return userSignPetitionRepository.findById(id).orElseThrow();
    }



}
