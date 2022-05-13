package odev.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import odev.entities.concretes.Oyuncu;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Oyuncu oyuncu) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy =new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(oyuncu.getTcNo()),oyuncu.getAd().toUpperCase(new Locale("tr")),
					oyuncu.getSoyad().toUpperCase(new Locale("tr")),Integer.parseInt(oyuncu.getDogumTarihi()) );
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
				
				
		return false;
	}
	
	
	
}
