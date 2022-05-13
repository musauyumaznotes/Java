package odev.business.abstracts;

import odev.entities.concretes.Oyun;

public interface OyunService {
	void Ekle(Oyun oyun);
	void Sil(Oyun oyun);
	void Guncelle(Oyun oyun);
	void Satmak(Oyun oyun);
}
