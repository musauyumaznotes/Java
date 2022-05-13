package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeService {
	Result add(ActivationCode activationCode);
	DataResult <List<ActivationCode>> getByIsActivated(boolean isActivated);
	DataResult<List<ActivationCode>> getByIsCodeConfirmed(boolean confirmedCode);
}
