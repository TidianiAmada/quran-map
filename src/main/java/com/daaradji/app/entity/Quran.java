package com.daaradji.app.entity;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.List;

@Document(collection = "sourates")
public class Quran {
    @Id
    @Value("617831407501940d132e06b0")
    private ObjectId id;
    private List<Sourate> sourates;

    public Quran() {
    }

    public List<Sourate> getSourates() {
        return sourates;
    }
}
