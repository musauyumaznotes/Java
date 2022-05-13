package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.core.entities.concretes.User;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;


@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Kullanıcılar Listelendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(userDao.findByEmail(email)," Kullanıcı Bulundu");
	}

	@Override
	public DataResult<User> findByEmailAndPassword(String email,String password) {
		return new SuccessDataResult<User>(userDao.findByEmailAndPassword(email, password));
	}

	@Override
	public DataResult<User> findByIsActivatedAndEmail(boolean isActivated, String email) {
		return new SuccessDataResult<User>(userDao.findByIsActivatedAndEmail(isActivated, email));
	}

	@Override
	public DataResult<List<User>> getByIsActivated(boolean isActivated) {
		if(isActivated == true) {
			return new SuccessDataResult<List<User>>(userDao.getByIsActivated(isActivated),"Aktif Kullanıcılar Listelendi");
		}else {
			return new SuccessDataResult<List<User>>(userDao.getByIsActivated(isActivated),"Pasif Kullanıcılar Listelendi");
		}
		
	}
	
	
}
