package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.JobSeekerActivationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerActivationDao;
import kodlamaio.hrms.entities.concretes.JobSeekerActivation;

public class JobSeekerActivationManager implements JobSeekerActivationService{

	private JobSeekerActivationDao jobSeekerActivationDao;
	
	public JobSeekerActivationManager(JobSeekerActivationDao jobSeekerActivationDao) {
		super();
		this.jobSeekerActivationDao = jobSeekerActivationDao;
	}

	@Override
	public DataResult<List<JobSeekerActivation>> getAll() {
		return new SuccessDataResult<List<JobSeekerActivation>>(jobSeekerActivationDao.findAll());
	}

	@Override
	public Result add(JobSeekerActivation jobSeekerActivation) {
		jobSeekerActivationDao.save(jobSeekerActivation);
		return new SuccessResult();
	}

	@Override
	public DataResult<JobSeekerActivation> findByIsActivatedAndJobSeekerId(boolean isActivated, int jobSeekerId) {
		return new SuccessDataResult<JobSeekerActivation>(jobSeekerActivationDao.findByIsActivatedAndJobSeekerId(isActivated, jobSeekerId));
	}

	@Override
	public DataResult<JobSeekerActivation> findByIsCodeConfirmedAndJobSeekerId(boolean isConfirmedCode,int jobSeekerId) {
		
		return new SuccessDataResult<JobSeekerActivation>(jobSeekerActivationDao.findByIsCodeConfirmedAndJobSeekerId(isConfirmedCode, jobSeekerId));
	}

}
