package com.htw.berlin.service;

import com.htw.berlin.model.UserPetition;
import com.htw.berlin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserPetition save(UserPetition userPetition){
        return userRepository.save(userPetition);
    }

    public UserPetition getUserById (Long Id){
        return  userRepository.findById(Id).orElseThrow();
    }

    public void deleteUserById (Long Id) {
        userRepository.deleteById(Id);
    }

    public List<UserPetition> getUsers(){
        return (List<UserPetition>) userRepository.findAll();
    }

    public UserPetition getUserByEmailPassword (String userEmail, String userPassword){
        return  userRepository.getUserByEmailPassword(userEmail,userPassword);
    }
}
