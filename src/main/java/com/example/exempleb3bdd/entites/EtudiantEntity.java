package com.example.exempleb3bdd.entites;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Etudiants")
public class EtudiantEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "nom")
    private String name;

    @Column(name = "prenom")
    private String first_name;

    @Column (name = "date_naissance")
    private LocalDate birth_date;

    @JoinColumn(name = "id_etudiant")
    @OneToMany(fetch = FetchType.LAZY)
    private List<EvaluationEntiy> evaluations;

    public List<EvaluationEntiy> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<EvaluationEntiy> evaluations) {
        this.evaluations = evaluations;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }
}

