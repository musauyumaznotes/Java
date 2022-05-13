package test.hrms2.core.adapters;

import java.util.regex.Pattern;

public class MernisDemo {

	String tcNO;

	private final String tcNOPattern = "[0-9]"; //Final : Bu ifadenin disina cikilamaz

	public boolean isValidNationolityIdentity(String tcNo) {
		
		if (tcNO.length() != 11) {
			return false;
		}	
		Pattern pattern = Pattern.compile(tcNOPattern);
		return pattern.matcher(tcNO).find();
	}

}
