package kodlamaio.hrms.core.adapters.Regex.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.adapters.Regex.abstracts.RegexCheckService;


@Service
public class RegexControlManager implements RegexCheckService{

	@Override
	public boolean checkEmailControl(String email) {
		 String format = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		    Pattern pattern = Pattern.compile(format);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	}

	@Override
	public boolean checkBirthdayControl(String birthOfDate) {
		String format = "(?:19|20)\\d\\d";

	    Pattern pattern = Pattern.compile(format);
        Matcher matcher = pattern.matcher(birthOfDate);
        return matcher.matches();
	}

	

	

}
