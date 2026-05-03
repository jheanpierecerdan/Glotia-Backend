package com.glottia.api.service;

import com.glottia.api.model.Language;
import com.glottia.api.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    public Optional<Language> findById(Integer id) {
        return languageRepository.findById(id);
    }

    public Language save(Language language) {
        return languageRepository.save(language);
    }

    public void deleteById(Integer id) {
        languageRepository.deleteById(id);
    }
}
