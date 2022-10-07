package com.knf.dev.AnimalsSpecies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animals,Long> {
//    List<Object> findAllByType(String valueOf);

    List<Animals> findByType(String type);
}
