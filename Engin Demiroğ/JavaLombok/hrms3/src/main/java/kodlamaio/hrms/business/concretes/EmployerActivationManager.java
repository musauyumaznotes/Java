package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerActivationService;
import kodlamaio.hrms.core.adapters.codeGenerator.CodeGeneratorService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerActivationDao;
import kodlamaio.hrms.entities.concretes.EmployerActivation;

@Service
public class EmployerActivationManager implements EmployerActivationService{

	
	private EmployerActivationDao employerActivationDao;
	private CodeGeneratorService codeGeneratorService;
	@Autowired
	public EmployerActivationManager(EmployerActivationDao employerActivationDao,CodeGeneratorService codeGeneratorService) {
		super();
		this.employerActivationDao = employerActivationDao;
		this.codeGeneratorService = codeGeneratorService;
	}

	@Override
	public DataResult<List<EmployerActivation>> getAll() {
		
		return new SuccessDataResult<List<EmployerActivation>>(this.employerActivationDao.findAll());
	}

	@Override
	public Result add(EmployerActivation employerActivation) {
		codeGeneratorService.sendActivationCode();
		
		this.employerActivationDao.save(employerActivation);
		return new SuccessResult(employerActivation.getEmployer().getCompanyName() + "eklendi");
	}

	@Override
	public DataResult<EmployerActivation> findByIsActivatedAndUserId(boolean isActivated, int employerId) {
		return new SuccessDataResult<EmployerActivation>(employerActivationDao.findByIsActivatedAndEmployerId(isActivated, employerId),"Getirildi");
	}

	@Override
	public DataResult<EmployerActivation> findByIsCodeConfirmedAndUserId(boolean isConfirmedCode, int employerId) {
		return new SuccessDataResult<EmployerActivation>(employerActivationDao.findByIsCodeConfirmedAndEmployerId(isConfirmedCode, employerId),"Getirildi");
	}

}
