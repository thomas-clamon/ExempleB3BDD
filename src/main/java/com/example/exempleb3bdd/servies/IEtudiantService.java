package com.example.exempleb3bdd.servies;

import com.example.exempleb3bdd.dto.EtudiantAddDto;
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

    /**
     * Enregister un nouvelle etudiant er renvoyer son ID
     * @param dto
     * @return
     */
    public Integer ajouter(EtudiantAddDto dto);

    public EtudiantDto get (Integer id);

    /**
     * Renvoi vrai si l'ID existe dans la table etudiant faux sinon
     * @param id
     * @return
     */
    Boolean Exist(Integer id);
}
