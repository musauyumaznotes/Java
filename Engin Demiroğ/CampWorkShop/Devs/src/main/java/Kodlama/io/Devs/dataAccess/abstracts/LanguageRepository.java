package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    Language getById(int id) throws Exception;
    void add(Language language);
    void delete(Language language);
    void update(Language language);

}
