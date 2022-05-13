package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployerActivation;

public interface EmployerActivationService {
	DataResult<List<EmployerActivation>> getAll();
	Result add(EmployerActivation employerActivation);
	DataResult<EmployerActivation> findByIsActivatedAndUserId(boolean isActivated ,int employerId);
	DataResult<EmployerActivation> findByIsCodeConfirmedAndUserId(boolean isConfirmedCode ,int employerId);
}
