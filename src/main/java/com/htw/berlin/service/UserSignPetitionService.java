package com.htw.berlin.service;

import com.htw.berlin.model.Petition;
import com.htw.berlin.model.UserPetition;
import com.htw.berlin.model.UserSignPetition;
import com.htw.berlin.repository.UserSignPetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSignPetitionService {

    @Autowired
    UserSignPetitionRepository userSignPetitionRepository;

    public UserSignPetition save(UserSignPetition userSignPetition){
        return userSignPetitionRepository.save(userSignPetition);
    }

    @Query
    public List<UserPetition> getUserPetitionByPetitionId (Long Id){
        return  userSignPetitionRepository.findById(Id).get().getUsers();
    }

    public void deleteUserById (Long Id){
        userSignPetitionRepository.deleteById(Id);
    }

    public Petition getPetitionById(Long Id){
        return  userSignPetitionRepository.findById(Id).get().getPetitionItem();
    }
}
