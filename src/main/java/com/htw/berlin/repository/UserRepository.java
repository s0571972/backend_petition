package com.htw.berlin.repository;

import com.htw.berlin.model.UserPetition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserPetition, Long> {
    @Query(value = "SELECT user FROM  UserPetition user where user.userEmail like :userEmail and user.userPassword like :userPassword")
    UserPetition getUserByEmailPassword(@Param("userEmail") String userEmail, @Param("userPassword")  String userPassword);
}
