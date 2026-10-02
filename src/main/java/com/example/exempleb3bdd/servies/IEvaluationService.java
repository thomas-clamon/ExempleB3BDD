package com.example.exempleb3bdd.servies;

import com.example.exempleb3bdd.dto.EvaluationDto;
import com.example.exempleb3bdd.entites.EvaluationEntiy;

import java.util.List;

public interface IEvaluationService {

    public EvaluationDto toDto(EvaluationEntiy entiy);

    public List<EvaluationDto> getAll();
}
