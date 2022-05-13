package Business.abstracts;



import Entities.concretes.User;

public interface UserService {
	void logIn(User user);
	void register(User user);
	void update(User user);
	void delete(User user);

}
