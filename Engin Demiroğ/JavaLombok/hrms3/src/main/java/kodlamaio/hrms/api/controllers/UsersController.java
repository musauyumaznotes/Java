package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.entities.concretes.User;
import kodlamaio.hrms.core.utilities.results.DataResult;


@RestController
@RequestMapping("/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		return userService.getAll();
	}
	@GetMapping("/findbyisactivatedandid")
	public DataResult<User> findByIsActivatedAndId(@RequestParam boolean isActivated,@RequestParam String email){
		return userService.findByIsActivatedAndEmail(isActivated, email);
	}
	@GetMapping("/getbyisactivated")
	public DataResult<List<User>> getByIsActivated(@RequestParam boolean isActivated){
		return userService.getByIsActivated(isActivated);
	}
	@GetMapping("/findbyemailandpassword")
	public DataResult<User> findByEmailAndPassword(@RequestParam String email,@RequestParam String password){
		return userService.findByEmailAndPassword(email, password);
	}
}

