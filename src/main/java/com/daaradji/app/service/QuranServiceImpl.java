package com.daaradji.app.service;

import com.daaradji.app.entity.Quran;
import com.daaradji.app.entity.Sourate;
import com.daaradji.app.repository.QuranRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuranServiceImpl implements QuranService {
    @Autowired
    private QuranRepo quranRepo;

    @Override
    public Sourate getSourate(int position) {
        return null; //quranRepo.findByPosition(position)
    }

    @Override
    public Quran allSourates() {
        return (Quran) quranRepo.findAll();

    }
}
