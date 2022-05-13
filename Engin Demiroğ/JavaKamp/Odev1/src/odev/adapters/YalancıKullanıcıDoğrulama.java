package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class YalancýKullanýcýDoðrulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Kullanýcý Doðrulandý");
		return true;
	}

}