package odev.adapters;

import odev.entities.concretes.Oyuncu;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Oyuncu oyuncu);
}
