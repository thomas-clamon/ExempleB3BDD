package com.example.exempleb3bdd.servies;

import com.example.exempleb3bdd.dto.EtudiantDto;
import com.example.exempleb3bdd.entites.EtudiantEntity;
import com.example.exempleb3bdd.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
@Service
public class EtudiantService implements IEtudiantService{

    @Autowired
    private EtudiantRepository repository;

    @Override
    public EtudiantDto toDto(EtudiantEntity entity) {
        EtudiantDto dto = new EtudiantDto();
        dto.setDisplay_name(entity.getFirst_name() + " " + entity.getName());

        //on calcule l'age.
        Integer age = Period.between(entity.getBirth_date(), LocalDate.now()).getYears();
        dto.setAge(age);

        return dto;
    }

    @Override
    public List<EtudiantDto> getAll() {
        List<EtudiantEntity> list = repository.findAll();
        List<EtudiantDto> result = new ArrayList<EtudiantDto>();
        for (int i = 0; i<list.size(); i++){
            //on tranforme l'etudiant en dto
            result.add(toDto(list.get(i)));
        }
        return result;

    }
}
