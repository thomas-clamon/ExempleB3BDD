package com.example.exempleb3bdd.dto;

import java.time.LocalDate;

public class EvaluationDto {

    private String matiere;
    private String note; // A B C ou D

    private LocalDate date;

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
