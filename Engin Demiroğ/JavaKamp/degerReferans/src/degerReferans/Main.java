package degerReferans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
//	int[] sayilar = {-1,1,-2,2};
//	int enKucukSayi=0;
//	
//	for (int i = 0; i < sayilar.length; i++) {
//		if (sayilar[i]<enKucukSayi) {
//			enKucukSayi = sayilar[i];
//		}
//	}
//	System.out.println(enKucukSayi);
		 	String yazi = "Turkcelle Baðlan Hayata";
	        char karakter;
	        int adet=0;
	        int enBuyukAdet=0;
	        for(int i = 0; i < yazi.length(); i++) {
	        	karakter = yazi.charAt(i);
	        	for (int j = 0; j < yazi.length(); j++) {
	        		 if(karakter == yazi.charAt(j)) {
	 	            	adet++;
	 	            }
				}
	        }
	        if(adet>enBuyukAdet) 
	        {
	        	enBuyukAdet = adet;
	        }
	        System.out.println(enBuyukAdet);
	 
	       
	}

}
