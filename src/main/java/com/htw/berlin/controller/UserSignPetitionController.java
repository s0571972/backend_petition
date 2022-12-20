package com.htw.berlin.controller;

import com.htw.berlin.model.UserPetition;
import com.htw.berlin.model.UserSignPetition;
import com.htw.berlin.service.UserSignPetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class UserSignPetitionController {

    @Autowired
    UserSignPetitionService userSignPetitionService;

    @PostMapping("/user_petition")
    public UserSignPetition createUser(@RequestBody UserSignPetition userSignPetition){
        return  userSignPetitionService.save(userSignPetition);
    }
    /*

    @GetMapping("/get_user_petition")
    public List<User> getUsers(){
        return userSignPetitionService.g();
    }

     */

    @DeleteMapping("/user_petition/{id}")
    public void deleteUserPetition(@PathVariable String id){
        Long userId = Long.parseLong(id);
        userSignPetitionService.deleteUserById(userId);
    }

    /*
    @DeleteMapping("/user_petition/{id}")
    public void deleteUserPetition(@PathVariable String id){
        Long userId = Long.parseLong(id);
        userSignPetitionService.deleteUserById(userId);
    }



    @GetMapping("/petition/{id}")
    public User getUser(@PathVariable String id){
        Long userId = Long.parseLong(id);
        return  userService.getUserById(userId);
    }

     */

    @GetMapping("/user_petition/{id}")
    public List<UserPetition> getUserPetition(@PathVariable String id){
        Long userId = Long.parseLong(id);
        return  userSignPetitionService.getUserPetitionByPetitionId(userId);
    }
}
