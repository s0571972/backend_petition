package com.htw.berlin.repository;

import com.htw.berlin.model.Petition;
import com.htw.berlin.model.UserPetitionPetition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPetitionPetitionRepository  extends CrudRepository<UserPetitionPetition, Long> {

    @Query(value = "SELECT p FROM  UserPetitionPetition p where p.petition = :petitionId")
    List<UserPetitionPetition> getUserPetitionPetitionByPetition(@Param("petitionId") Petition petitionId);
}
