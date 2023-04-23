package com.vn.indianlocalizer.localizer;

import com.vaadin.flow.i18n.I18NProvider;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vn.indianlocalizer.repo.LocaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@SpringComponent
public class IndianLocalizer implements I18NProvider {


    LocaleRepo localeRepo;
    @Override
    public List<Locale> getProvidedLocales() {
        localeRepo = new LocaleRepo();
        return localeRepo.getAllLanguages();
    }

    public Locale getLocale(String language){
        return getProvidedLocales().stream().
                filter(locale -> locale.getLanguage().equals(language)).
                findFirst().orElse(null);
    }

    @Override
    public String getTranslation(String s, Locale locale, Object... objects) {
        return null;
    }

    public String getTranslation(Object key, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", locale);
        return bundle.getString((String)key);
    }

    @Override
    public String getTranslation(Object key, Locale locale, Object... params) {
        ResourceBundle bundle = ResourceBundle.getBundle("Bundle", locale);
        return bundle.getString((String)key);
    }
}
