package com.htw.berlin.repository;

import com.htw.berlin.model.Petition;
import com.htw.berlin.model.UserPetition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetitionRepository extends CrudRepository<Petition, Long> {
    @Query(value = "SELECT p FROM  Petition p where p.userId = :userId")
    List<Petition> getPetitionUser(@Param("userId") String userId);
}
