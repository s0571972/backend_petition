package com.htw.berlin.controller;

import com.htw.berlin.model.Petition;
import com.htw.berlin.model.UserPetitionPetition;
import com.htw.berlin.service.UserPetitionPetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Component
public class UserPetitionPetitionController {

    @Autowired
    UserPetitionPetitionService userPetitionPetitionService;

    @PostMapping("/user_petition")
    @CrossOrigin
    public UserPetitionPetition createUser(@RequestBody UserPetitionPetition userSignPetition){
        List<UserPetitionPetition> petitions =  getUserPetition(userSignPetition.getPetition());
      /*
        to prevent double signed petition
       */
        if(petitions != null){
            List<UserPetitionPetition> petitionsFilter = petitions.stream().filter(c -> c.getUserPetition().getId() == userSignPetition.getUserPetition().getId())
                    .collect(Collectors.toList());
            if(petitionsFilter.isEmpty()){
                userPetitionPetitionService.save(userSignPetition);
            }
        }
        return  userSignPetition;
    }

    @PostMapping("/user_petition_id")
    @CrossOrigin
    public List<UserPetitionPetition> getUserPetition(@RequestBody Petition petition){

        List<UserPetitionPetition>  userPetitionPetitions = userPetitionPetitionService.getUserPetitionPetitions(petition);
        return  userPetitionPetitions;
    }

    @GetMapping("/sign_petitions")
    @CrossOrigin
    public List<UserPetitionPetition> getUserSignPetitions(){
        return  userPetitionPetitionService.getUserPetitionPetitions();
    }
}
