package DataAccess.abstracts;



import Entities.concretes.User;

public interface UserDao {
	void register(User user);
	void update(User user);
	void delete(User user);
	
	
}
