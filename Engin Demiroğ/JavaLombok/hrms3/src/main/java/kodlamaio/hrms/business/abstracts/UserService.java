package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.entities.concretes.User;
import kodlamaio.hrms.core.utilities.results.DataResult;


public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> findByEmail(String email);
	DataResult<User> findByEmailAndPassword(String email,String password);
	DataResult<User> findByIsActivatedAndEmail(boolean isActivated,String email);
	DataResult<List<User>> getByIsActivated(boolean isActivated);
}
