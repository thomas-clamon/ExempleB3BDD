package com.example.exempleb3bdd.servies;

import com.example.exempleb3bdd.dto.EvaluationDto;
import com.example.exempleb3bdd.entites.EvaluationEntiy;
import com.example.exempleb3bdd.repositories.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EvaluationService implements IEvaluationService{

    @Autowired
    private EvaluationRepository repository;

    @Override
    public EvaluationDto toDto(EvaluationEntiy entiy) {
        EvaluationDto dto = new EvaluationDto();
        dto.setMatiere(entiy.getDescription());
        dto.setDate(entiy.getDate());

        // on calcul la note en A B C D;
        // on recupere la note
        Float note = entiy.getNote();
        String final_note = null;
        if ((note <= 20) && (note <= 15))
                final_note = "A";
        if ((note <= 14) && (note < 10))
            final_note = "B";
        if (note == 10)
            final_note = "C";
        if ((note <= 9) && (note <= 5))
            final_note = "D";
        if ((note <= 4) && (note <= 0))
            final_note = "D";
        dto.setNote(final_note);
        return dto;


    }

    @Override
    public List<EvaluationDto> getAll() {
        List<EvaluationDto> result = new ArrayList<>();
        // on recupere toutes les notes
        List<EvaluationEntiy> list = repository.findAll();
        for (int i =0; i<list.size(); i++){
            result.add(toDto(list.get(i)));
        }
        return result;

    }
}
