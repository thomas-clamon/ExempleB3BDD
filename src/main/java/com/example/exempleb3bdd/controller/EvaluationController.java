package com.example.exempleb3bdd.controller;

import com.example.exempleb3bdd.servies.EtudiantService;
import com.example.exempleb3bdd.servies.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("evaluation")
public class EvaluationController
{
    @Autowired
    private EvaluationService service;

    @GetMapping("all")
    public ResponseEntity getAll(){
        return new ResponseEntity(service.getAll(), HttpStatusCode.valueOf(200));
    }
}
