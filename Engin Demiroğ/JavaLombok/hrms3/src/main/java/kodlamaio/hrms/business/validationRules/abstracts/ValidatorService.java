package kodlamaio.hrms.business.validationRules.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;



public interface ValidatorService {
	Result passwordControl(String password,String confirmPassword);
	Result checkEmailExists (String email);
	
}
