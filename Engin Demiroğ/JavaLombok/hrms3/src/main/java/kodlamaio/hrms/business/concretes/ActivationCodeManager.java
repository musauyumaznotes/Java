package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ActivationCodeDao;
import kodlamaio.hrms.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager implements ActivationCodeService{
	private ActivationCodeDao activationCodeDao;
	
	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		super();
		this.activationCodeDao = activationCodeDao;
	}
	@Override
	public Result add(ActivationCode activationCode) {
		activationCode.setCodeConfirmed(true);
		activationCode.setActivated(true);
		
		activationCodeDao.save(activationCode);
		return new SuccessResult("Aktivasyon Bilgileri Sisteme Kaydedildi");
	}
	@Override
	public DataResult<List<ActivationCode>> getByIsActivated(boolean isActivated) {
		return new SuccessDataResult<List<ActivationCode>>(activationCodeDao.getByIsActivated(isActivated));
	}
	@Override
	public DataResult<List<ActivationCode>> getByIsCodeConfirmed(boolean confirmedCode) {
		return new SuccessDataResult<List<ActivationCode>>(activationCodeDao.getByIsCodeConfirmed(confirmedCode));
	}
	
	

}
