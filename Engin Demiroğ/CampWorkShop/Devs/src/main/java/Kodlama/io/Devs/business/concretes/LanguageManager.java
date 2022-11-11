package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() throws Exception {
        if (CheckLanguagesNullControl(languageRepository.getAll()))
            return languageRepository.getAll();
        throw new Exception("Listede herhangi bir Programlama Dili bulunmamaktadır!");

    }

    @Override
    public Language getById(int id) throws Exception {
        if (CheckLanguageNullOrEmpty(languageRepository.getById(id)))
            return languageRepository.getById(id);
        throw new Exception("Aradığınız Değer Bulunamamıştır.");
    }

    @Override
    public void add(Language language) throws Exception {
        if (CheckLanguageNullOrEmpty(language) && CheckLanguageNameControl(getAll(), language.getName())) {
            languageRepository.add(language);
            return;
        }
        throw new Exception("Eklemeye Çalıştığınız değer boş geçilemez veya Bu değer kayıtlarımızda var.");
    }

    @Override
    public void delete(Language language) throws Exception {
        if (CheckLanguageNullOrEmpty(language)) {
            languageRepository.delete(language);
            return;
        }
        throw new Exception("Silmeye çalıştığınız değer bulunamadı");
    }

    @Override
    public void update(Language language) throws Exception {
        if (CheckLanguageNullOrEmpty(language)) {
            languageRepository.update(language);
            return;
        }
        throw new Exception("Güncellemeye çalıştığınız değer bulunamadı");
    }

    private boolean CheckLanguagesNullControl(List<Language> languages) {
        if (languages == null)
            return false;
        return true;
    }

    private boolean CheckLanguageNameControl(@NotNull List<Language> languages, String name) {

        for (Language language : languages) {
            if (language.getName().trim().toLowerCase().equals(name.toLowerCase().trim()))
                return false;
        }
        return true;
    }

    private boolean CheckLanguageNullOrEmpty(Language language) {
        if (language != null && !language.getName().equals(""))
            return true;
        return false;
    }
}
