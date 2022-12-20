package com.htw.berlin.repository;

import com.htw.berlin.model.Petition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetitionRepository extends CrudRepository<Petition, Long> {
}
