package com.vn.indianlocalizer.controller;

import com.vn.indianlocalizer.localizer.IndianLocalizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class LocaleController {

    @Autowired
    private ApplicationContext applicationContext;



    @GetMapping("/get/{lang}/{key}")
    public @ResponseBody String getTranslation(@PathVariable String lang, @PathVariable String key){
        IndianLocalizer indianLocalizer = applicationContext.getBean(IndianLocalizer.class);
        Locale locale = indianLocalizer.getLocale(lang);
        return indianLocalizer.getTranslation(key,locale);
    }

    @GetMapping("/getLanguages")
    public List<String> getAllLanguages(){
        IndianLocalizer indianLocalizer = applicationContext.getBean(IndianLocalizer.class);

        return indianLocalizer.getProvidedLocales().stream().map(Locale::getLanguage).collect(Collectors.toList());
    }
}
