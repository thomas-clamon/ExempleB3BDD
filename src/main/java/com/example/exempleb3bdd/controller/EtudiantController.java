package com.example.exempleb3bdd.controller;

import com.example.exempleb3bdd.dto.EtudiantAddDto;
import com.example.exempleb3bdd.repositories.EtudiantRepository;
import com.example.exempleb3bdd.servies.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("etudiant")
public class EtudiantController {
    @Autowired
    private EtudiantService service;

    @GetMapping("all")
    public ResponseEntity getAll(){
        return  new ResponseEntity( service.getAll(), HttpStatusCode.valueOf(200));
    }

    @PostMapping("add")
    public ResponseEntity ajouter(@RequestBody EtudiantAddDto dto){
        return  new ResponseEntity( service.ajouter(dto), HttpStatusCode.valueOf(200));
    }

    @GetMapping("get/{id}")
    public ResponseEntity get(@PathVariable Integer id ){

        // on verifie si l'ID existe
        if (!service.Exist(id))
            return new ResponseEntity("L'id n'existe pas", HttpStatusCode.valueOf(201) );

        return new ResponseEntity  (service.get(id), HttpStatusCode.valueOf(200));
    }
}
