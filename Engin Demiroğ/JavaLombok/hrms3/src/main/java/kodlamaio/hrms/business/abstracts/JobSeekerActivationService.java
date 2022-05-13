package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerActivation;

public interface JobSeekerActivationService {
	DataResult<List<JobSeekerActivation>> getAll();
	Result add(JobSeekerActivation jobSeekerActivation);
	DataResult<JobSeekerActivation> findByIsActivatedAndJobSeekerId(boolean isActivated ,int jobSeekerId);
	DataResult<JobSeekerActivation> findByIsCodeConfirmedAndJobSeekerId(boolean isConfirmedCode ,int jobSeekerId);
}
