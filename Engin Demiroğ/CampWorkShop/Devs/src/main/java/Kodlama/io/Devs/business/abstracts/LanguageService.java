package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll() throws Exception;
    Language getById(int id) throws Exception;
    void add(Language language) throws Exception;
    void delete(Language language) throws Exception;
    void update(Language language) throws Exception;
}
