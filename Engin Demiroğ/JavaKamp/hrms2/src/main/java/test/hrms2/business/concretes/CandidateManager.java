package test.hrms2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.hrms2.business.abstracts.CandidateService;
import test.hrms2.core.results.DataResult;
import test.hrms2.core.results.ErrorResult;
import test.hrms2.core.results.Result;
import test.hrms2.core.results.SuccessDataResult;
import test.hrms2.dataAccess.abstracts.CandidateDao;
import test.hrms2.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {

		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),
				"Is arayanlar basarili bir sekilde listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Result add(Candidate candidate) {
	 * if(candidate.getPassword().length() <=6){ return new
	 * ErrorResult("Şifre 6 karakterden uzun olmalıdır"); }else
	 * if(!isEmailValid(candidate.getEmail())){ return new
	 * ErrorResult("Email geçerli formatta değil"); }else
	 * if(getByNationalNumber(candidate.getIdentificationNumber()).getData() !=
	 * null){ return new ErrorResult("Bu kimlik numarası zaten kayıtlı"); }else
	 * if(userService.getByEmail(candidate.getEmail()).getData() != null){ return
	 * new ErrorResult("Bu email zaten kayıtlı"); }else
	 * if(nationalValidationService.validate(candidate)){
	 * candidate.setMailVerify(false); this.candidateDao.save(candidate);
	 * this.emailService.sendVerifyEmail(candidate,this.activationCodeService.
	 * createActivationCode(candidate)); return new
	 * SuccessResult(candidate.getEmail()+" Adresine doğrulama kodu gönderildi");
	 * }else{ return new ErrorResult("Kullanıcı bilgileri hatalı"); }
	 * 
	 * }
	 * 
	 * private final String EMAIL_PATTERN =
	 * "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 * 
	 * public boolean isEmailValid(String emailInput) { Pattern pattern =
	 * Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE); return
	 * pattern.matcher(emailInput).find(); }
	 * 
	 * @Override public DataResult<Candidate> getByNationalNumber(String
	 * nationalNumber) { return new
	 * SuccessDataResult<Candidate>(this.candidateDao.findByNationalNumber(
	 * nationalNumber),"Listelendi"); }
	 * 
	 * @Override public DataResult<Candidate> getByEmail(String email) { return new
	 * SuccessDataResult<Candidate>(this.candidateDao.findByEmail(email),
	 * "Listelendi"); }
	 */
}
