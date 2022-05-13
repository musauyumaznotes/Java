package kodlamaio.hrms.business.validationRules.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.validationRules.abstracts.JobSeekerValidatorService;
import kodlamaio.hrms.core.utilities.results.Result;




@Service
public class JobSeekerValidatorManager implements JobSeekerValidatorService {

	@Override
	public Result emailCodeConfirm(boolean isConfirmedCode, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result activationControl(boolean isActivated, int id) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
