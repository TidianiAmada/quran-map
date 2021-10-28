package com.daaradji.app.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.List;


public class Sourate {

    private Integer position;
    private String nom;
    //column name
    private String nom_phonetique;
    //column name
    private String englishNameTranslation;

    private List<Verset> versets;

    public Sourate() {
    }

    public Integer getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }

    public String getNomPhonetique() {
        return nom_phonetique;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public List<Verset> getVersets() {
        return versets;
    }
}
