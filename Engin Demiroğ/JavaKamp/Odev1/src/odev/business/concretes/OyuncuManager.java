package odev.business.concretes;




import odev.adapters.CustomerCheckService;

import odev.business.abstracts.OyuncuService;
import odev.entities.concretes.Oyuncu;

public class OyuncuManager implements OyuncuService{

	
	private CustomerCheckService kontrol;

	public OyuncuManager(CustomerCheckService customerCheckService) {
		this.kontrol = customerCheckService;
	}

	@Override
	public void KayýtOlma(Oyuncu oyuncu) {
		
		
		
		if(kontrol.checkIfRealPerson(oyuncu)) {
			System.out.println("Kayýt Olundu : " + oyuncu.getAd());
		}
		else {
			System.out.println("Hata!!!");
		}
		
		
		
	}

	@Override
	public void HesapSil(Oyuncu oyuncu) {
		System.out.println("Hesap Silindi : " + oyuncu.getAd());
		
	}

	@Override
	public void HesapGuncelle(Oyuncu oyuncu) {
		System.out.println("Hesap Güncellendi : " + oyuncu.getAd());
		
	}

	

}
