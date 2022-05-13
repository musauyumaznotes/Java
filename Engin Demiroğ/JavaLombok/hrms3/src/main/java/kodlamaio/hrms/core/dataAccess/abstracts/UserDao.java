package kodlamaio.hrms.core.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.core.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
	User findByEmailAndPassword(String email, String password);
	User findByIsActivatedAndEmail(boolean isActivated,String email);
	List<User> getByIsActivated(boolean isActivated);
}
