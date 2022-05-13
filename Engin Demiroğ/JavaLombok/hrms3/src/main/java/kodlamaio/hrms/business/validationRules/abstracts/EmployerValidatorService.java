package kodlamaio.hrms.business.validationRules.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;




public interface EmployerValidatorService{

	Result employeeConfirmControl(boolean confirmedEmployer,int id);
	Result domainControl(String email,String webAddress);
	Result emailCodeConfirm(boolean isConfirmedCode ,int id);
	Result activationControl(boolean isActivated , int id);
	
	
}
