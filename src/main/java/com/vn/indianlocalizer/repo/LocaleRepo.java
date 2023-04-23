package com.vn.indianlocalizer.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class LocaleRepo {
    Locale punjabi = new Locale("punjabi","IN");
    Locale marathi = new Locale("marathi","IN");
    Locale kannada = new Locale("kannada","IN");

    public List<Locale> getAllLanguages(){
        List<Locale> languages = new ArrayList<>();
        languages.add(punjabi);
        languages.add(marathi);
        languages.add(kannada);
        return languages;
    }
}
