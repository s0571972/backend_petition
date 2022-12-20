package com.htw.berlin.repository;

import com.htw.berlin.model.UserSignPetition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignPetitionRepository extends CrudRepository<UserSignPetition, Long> {
}