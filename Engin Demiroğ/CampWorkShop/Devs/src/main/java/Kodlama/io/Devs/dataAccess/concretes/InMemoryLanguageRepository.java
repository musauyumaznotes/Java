package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "C"));
        languages.add(new Language(4, "Python"));
        languages.add(new Language(5, "C++"));
        languages.add(new Language(6, "Go"));
        languages.add(new Language(7, "JavaScript"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) {
        for (Language language : languages) {
            if (language.getId() == id)
                return language;
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        Language deletedLanguage = getById(language.getId());
        languages.remove(deletedLanguage);
    }

    @Override
    public void update(Language language) {
        Language updatedLanguage = getById(language.getId());
        updatedLanguage.setName(language.getName());
    }
}
