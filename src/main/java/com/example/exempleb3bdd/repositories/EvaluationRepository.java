package com.example.exempleb3bdd.repositories;

import com.example.exempleb3bdd.entites.EvaluationEntiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<EvaluationEntiy, Integer> {
}
