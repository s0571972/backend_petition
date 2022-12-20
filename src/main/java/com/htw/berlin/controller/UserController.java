package com.htw.berlin.controller;

import com.htw.berlin.model.UserPetition;
import com.htw.berlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public UserPetition createUser(@RequestBody UserPetition userPetition){
        return  userService.save(userPetition);
    }
    @GetMapping("/users")
    public List<UserPetition> getUsers(){
        return userService.getUsers();
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        Long userId = Long.parseLong(id);
        userService.deleteUserById(userId);
    }

}
