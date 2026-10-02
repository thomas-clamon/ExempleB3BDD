package com.example.exempleb3bdd.servies;

import com.example.exempleb3bdd.dto.EtudiantDto;
import com.example.exempleb3bdd.entites.EtudiantEntity;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface IEtudiantService {

    /**
     * Tranform une entité JPA (Issue de la base en DTO)
     * @param entity
     * @return
     */
    public EtudiantDto toDto(EtudiantEntity entity);

    /**
     * Recupere tout les etudiant et les transform en Dto
     * @return
     */
    public List<EtudiantDto> getAll();
}
