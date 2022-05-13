package kodlamaio.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeConfirmService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeConfirmDao;
import kodlamaio.hrms.entities.concretes.EmployeeConfirm;

@Service
public class EmployeeConfirmManager implements EmployeeConfirmService{
	private EmployeeConfirmDao employeeConfirmDao;

	@Autowired
	public EmployeeConfirmManager(EmployeeConfirmDao employeeConfirmDao) {
		super();
		this.employeeConfirmDao = employeeConfirmDao;
	}

	@Override
	public DataResult<List<EmployeeConfirm>> getAll() {
		
		return new SuccessDataResult<List<EmployeeConfirm>>(employeeConfirmDao.findAll());
	}

	@Override
	public Result add(EmployeeConfirm employeeConfirm) {
		employeeConfirm.setConfirmed(true);
		employeeConfirm.setConfirmedDate(LocalDate.now());
		employeeConfirmDao.save(employeeConfirm);
		return new  SuccessResult(employeeConfirm.getEmployee().getName() +" Eklendi");
	}

	@Override
	public DataResult<EmployeeConfirm> findByIsConfirmedAndId(boolean confirmedEmployer, int id) {
		return new SuccessDataResult<EmployeeConfirm>(employeeConfirmDao.findByIsConfirmedAndId(confirmedEmployer, id));
	}

	
	
}
