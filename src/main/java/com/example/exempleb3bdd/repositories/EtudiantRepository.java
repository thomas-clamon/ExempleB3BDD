package com.example.exempleb3bdd.repositories;

import com.example.exempleb3bdd.entites.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}
