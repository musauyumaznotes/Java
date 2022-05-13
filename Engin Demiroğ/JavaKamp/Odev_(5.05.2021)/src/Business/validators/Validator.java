package Business.validators;


import Entities.concretes.User;

public interface Validator {
	 boolean registerIsValid(User user);
	 boolean logInIsValid(User user);
}
