package com.htw.berlin.repository;

import com.htw.berlin.model.UserPetition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserPetition, Long> {
}
