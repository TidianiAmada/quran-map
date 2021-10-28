package com.daaradji.app.service;

import com.daaradji.app.entity.Quran;
import com.daaradji.app.entity.Sourate;

import java.util.List;

public interface QuranService {
    Sourate getSourate(int position);
    Quran allSourates();
}
