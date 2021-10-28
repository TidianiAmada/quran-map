package com.daaradji.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Verset {
    private Integer position;
    private String text;
    private String revelation;
    private int juz;
    private int manzil;
    private int page;
    private int ruku;
    private int hizbQuater;
    private boolean sajda;
    // Column name
    private String text_arabe;

    public Verset() {
    }

    public Integer getPosition() {
        return position;
    }

    public String getText() {
        return text;
    }

    public String getRevelation() {
        return revelation;
    }

    public int getJuz() {
        return juz;
    }

    public int getManzil() {
        return manzil;
    }

    public int getPage() {
        return page;
    }

    public int getRuku() {
        return ruku;
    }

    public int getHizbQuater() {
        return hizbQuater;
    }

    public boolean isSajda() {
        return sajda;
    }

    public String getTextArabe() {
        return text_arabe;
    }
}
