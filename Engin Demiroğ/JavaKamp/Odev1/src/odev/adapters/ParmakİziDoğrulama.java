package odev.adapters;

import odev.entities.concretes.Oyuncu;

public class ParmakÝziDoðrulama implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		System.out.println("Parmak Ýzi Doðrulanmýþ");
		return true;
	}

}
