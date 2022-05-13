package kodlamaio.hrms.business.validationRules.concretes;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstracts.EmployeeConfirmService;
import kodlamaio.hrms.business.abstracts.EmployerActivationService;
import kodlamaio.hrms.business.validationRules.abstracts.EmployerValidatorService;



import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;





@Service
public class EmployerValidatorManager  implements EmployerValidatorService {

	
	
	private EmployeeConfirmService employeeConfirmService;
	private EmployerActivationService employerActivationService;
	

	
	
	
	
	@Autowired
	public EmployerValidatorManager(EmployeeConfirmService employeeConfirmService,EmployerActivationService employerActivationService) {
		
		this.employerActivationService =employerActivationService;
		this.employeeConfirmService = employeeConfirmService;
		
	}

	@Override
	public Result domainControl(String email, String webAddress) {
		String[] emails = email.split("@", 2);
		String domain = webAddress.substring(4, webAddress.length());

		if (emails[1].equals(domain)) {

			return new SuccessResult("Domain Kontrolü Tamamlandı");
		}

		else {
		return new ErrorResult("Oluşturduğuz Email Şirket Web Adresiyle uyuşmuyor.");
		}
	}

	@Override
	public Result employeeConfirmControl(boolean confirmedEmployer, int id) {
		if(employeeConfirmService.findByIsConfirmedAndId(confirmedEmployer, id).isSuccess()) {
			return new SuccessResult();
		}
		else {
			return new ErrorResult("Kullanıcı Aktivasyonu Tamamlanamadı Lütfen Sistemin onaylamasını Bekleyiniz");
		}
		
		
	}

	@Override
	public Result emailCodeConfirm(boolean isConfirmedCode, int id) {
		if(employerActivationService.findByIsCodeConfirmedAndUserId(isConfirmedCode, id).isSuccess()) {
			return new SuccessResult();
		}else {
			return new ErrorResult("Aktivasyon Kodu Onaylanmadı Lütfen Kontrolleri Sağlayınız");
		}
		
	}

	@Override
	public Result activationControl(boolean isActivated, int id) {
		if(employerActivationService.findByIsActivatedAndUserId(isActivated, id).isSuccess()) {
			return new  SuccessResult();
		}else {
			return new ErrorResult("Aktivasyon tamamlanmadı Lütfen Bekleyiniz");
		}
		
	}

	
	


	
}

