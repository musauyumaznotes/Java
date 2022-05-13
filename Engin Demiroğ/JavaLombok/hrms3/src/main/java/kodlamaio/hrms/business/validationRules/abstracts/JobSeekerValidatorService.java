package kodlamaio.hrms.business.validationRules.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

public interface JobSeekerValidatorService {
	Result emailCodeConfirm(boolean isConfirmedCode ,int id);
	Result activationControl(boolean isActivated , int id);
	
}
	
