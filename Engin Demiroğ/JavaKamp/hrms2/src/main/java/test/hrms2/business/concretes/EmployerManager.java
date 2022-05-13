package test.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hrms2.business.abstracts.EmployerService;
import test.hrms2.core.results.DataResult;
import test.hrms2.core.results.Result;
import test.hrms2.core.results.SuccessDataResult;
import test.hrms2.dataAccess.abstracts.EmployerDao;
import test.hrms2.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),
				"Is verenler basarili bir sekilde listelendi");
	}

	@Override
	public Result add(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

}
