package odev.business.abstracts;

import odev.entities.concretes.Kampanya;

public interface KampanyaService {
	void Ekle(Kampanya kampanya);
	void Silme(Kampanya kampanya);
	void Guncelleme(Kampanya kampanya);
}
