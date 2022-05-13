package kodlamaio.hrms.core.adapters.Regex.abstracts;

public interface RegexCheckService {
	boolean checkEmailControl(String email);
	boolean checkBirthdayControl(String birthOfDate);
}
