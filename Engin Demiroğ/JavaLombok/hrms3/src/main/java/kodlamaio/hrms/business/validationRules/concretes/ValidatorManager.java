package kodlamaio.hrms.business.validationRules.concretes;



import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.validationRules.abstracts.ValidatorService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;



@Service
public class ValidatorManager implements ValidatorService{

	private UserService userService;
	private ActivationCodeService activationCodeService;
	
	
	public ValidatorManager(UserService userService,ActivationCodeService activationCodeService) {
		super();
		this.userService = userService;
		this.activationCodeService=activationCodeService;
		
	}

	@Override
	public Result passwordControl(String password, String confirmPassword) {
		if (password.equals(confirmPassword)) {
			return new SuccessResult("Şifre Onaylandı ve Kaydedildi");
			
			
		}else {
			return new ErrorResult("Şifreler Uyuşmuyor Lütfen kontrol ediniz");
		}

		
	}

	@Override
	public Result checkEmailExists(String email) {
		if(this.userService.findByEmail(email).getData()==null) {
			return new SuccessResult("Email Kayıt Edilmeye Hazır");
			
		}else {
			return new ErrorResult("Email Sistemimize Kayıtlıdır");
		}
	}

	

	
	}

	

	

	

	


