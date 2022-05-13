package kodlamaio.hrms.business.concretes;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.businessRules.BusinessRules;
import kodlamaio.hrms.business.validationRules.abstracts.EmployerValidatorService;
import kodlamaio.hrms.business.validationRules.abstracts.ValidatorService;
import kodlamaio.hrms.core.adapters.codeGenerator.CodeGeneratorService;
import kodlamaio.hrms.core.entities.concretes.User;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.core.utilities.results.SuccessResult;

import kodlamaio.hrms.entities.concretes.EmployeeConfirm;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.EmployerActivation;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import kodlamaio.hrms.entities.concretes.JobSeekerActivation;
import kodlamaio.hrms.entities.dtos.EmployerForRegisterDto;
import kodlamaio.hrms.entities.dtos.JobSeekerForRegisterDto;
import kodlamaio.hrms.entities.dtos.UserForLoginDto;


@Service
public class AuthManager implements AuthService{
	private ValidatorService validatorService;
	private EmployerValidatorService employerValidatorService;
	private EmployerService employerService;
	private JobSeekerService jobSeekerService;
	private CodeGeneratorService codeGeneratorService;
	private UserService userService;
	private ModelMapper modelMapper;
	
	
	@Autowired
	public AuthManager(UserService userService,EmployerValidatorService employerValidatorService,EmployerService employerService,JobSeekerService jobSeekerService,CodeGeneratorService codeGeneratorService,ValidatorService validatorService,ModelMapper modelMapper) {
		super();
		this.employerValidatorService = employerValidatorService;
		this.employerService=employerService;
		this.jobSeekerService = jobSeekerService;
		this.codeGeneratorService = codeGeneratorService;
		this.validatorService = validatorService;
		this.modelMapper = modelMapper;
		this.userService = userService;
		
	}

	@Override
	public Result registerEmployer(EmployerForRegisterDto employerForRegisterDto) {
		
		Employer employer = modelMapper.map(employerForRegisterDto, Employer.class);
		
		Result businessRule1=BusinessRules.Run(validatorService.passwordControl(employerForRegisterDto.getPassword(), employerForRegisterDto.getPasswordAgain()),
				validatorService.checkEmailExists(employerForRegisterDto.getEmail()),
				employerValidatorService.domainControl(employerForRegisterDto.getEmail(), employerForRegisterDto.getWebAddress())
				);
		
//		Result businessRule2 = BusinessRules.Run(employerValidatorService.emailCodeConfirm(true, employer.getId()),
//				employerValidatorService.employeeConfirmControl(true, employer.getId()),
//				employerValidatorService.activationControl(true, employer.getId()));
				
			if(businessRule1.isSuccess()) {
				employerService.add(employer);
				return new SuccessResult(employerForRegisterDto.getCompanyName()+" İsimli Şirket Sisteme Dahil Oldu Lütfen Giriş Yapabilmek İçin Sistem Tarafından Aktivasyonun Tamamlanmasını Bekleyiniz");
			}	else {
				
				return new ErrorResult(businessRule1.getMessage());
			
			}
		
			
}

	@Override
	public Result registerJobSeeker(JobSeekerForRegisterDto jobSeekerForRegisterDto) {
		
		JobSeeker jobSeeker = modelMapper.map(jobSeekerForRegisterDto, JobSeeker.class);
		
		Result businessRule1 = BusinessRules.Run(validatorService.checkEmailExists(jobSeekerForRegisterDto.getEmail()),
				validatorService.passwordControl(jobSeekerForRegisterDto.getPassword(), jobSeekerForRegisterDto.getPasswordAgain()));
		
		
		codeGeneratorService.sendActivationCode();
		
//		Result businessRule2 =  BusinessRules.Run(validatorService.emailCodeConfirm(true),
//				validatorService.activationControl(true));
		
		
		if(businessRule1.isSuccess()==true) {
			
			jobSeekerService.add(jobSeeker);
			return new SuccessResult(jobSeekerForRegisterDto.getName() + " İsimli Kullanıcı Sisteme Dahil Oldu Hayırlı Olsun");
		}	
		else {
			return new ErrorResult(businessRule1.getMessage());
		}
		
		
		
		
	}
	

	@Override
	public Result loginUser(UserForLoginDto userForLoginDto) {
		User user = modelMapper.map(userForLoginDto, User.class);
		if(userService.findByEmailAndPassword(user.getEmail(),user.getPassword()).getData()!=null&&userService.findByIsActivatedAndEmail(true, user.getEmail()).getData()!=null) {
			
			return new SuccessResult("Giriş Sağlandı");
		
		}
		else {
			return new ErrorResult("Giriş Sağlanamadı");
		}
		
		
	}

	

	
	
}
