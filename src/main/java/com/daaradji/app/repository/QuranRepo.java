package com.daaradji.app.repository;

import com.daaradji.app.entity.Quran;
import com.daaradji.app.entity.Sourate;
import com.daaradji.app.entity.Verset;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface QuranRepo extends MongoRepository<Quran, ObjectId> {
    //Sourate findByPosition(int position);
    // how to get Collection<Verset>
}
