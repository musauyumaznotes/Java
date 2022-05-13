package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.dtos.EmployerForRegisterDto;
import kodlamaio.hrms.entities.dtos.JobSeekerForRegisterDto;
import kodlamaio.hrms.entities.dtos.UserForLoginDto;


public interface AuthService {
	Result registerEmployer(EmployerForRegisterDto employerForRegisterDto);
	Result registerJobSeeker(JobSeekerForRegisterDto jobSeekerForRegisterDto);
	Result loginUser(UserForLoginDto userForLoginDto);

}
