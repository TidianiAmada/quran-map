package com.daaradji.app.controllers;

import com.daaradji.app.entity.Quran;
import com.daaradji.app.entity.Sourate;
import com.daaradji.app.service.QuranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuranController {
    @Autowired
    private QuranService quranService;

    @GetMapping("/quran/sourates/{position}")
    public ResponseEntity<Sourate> sourate(@PathVariable int position){
        return ResponseEntity.ok().body(quranService.getSourate(position));
    }
    @GetMapping("/quran/sourates")
    public ResponseEntity<Quran> sourates(){
        return ResponseEntity.ok().body(quranService.allSourates());
    }
}
