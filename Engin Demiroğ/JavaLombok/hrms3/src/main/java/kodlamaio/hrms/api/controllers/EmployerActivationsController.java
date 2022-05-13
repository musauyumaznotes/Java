package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerActivationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployerActivation;

@RestController
@RequestMapping("/api/employeractivationservice")
public class EmployerActivationsController {
	
	private EmployerActivationService employerActivationService;

	@Autowired
	public EmployerActivationsController(EmployerActivationService employerActivationService) {
		super();
		this.employerActivationService = employerActivationService;
	}
	@GetMapping("/getAll")
	public DataResult<List<EmployerActivation>> getAll(){
		return this.employerActivationService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody EmployerActivation employerActivation) {
		return this.employerActivationService.add(employerActivation);
	}
	
}
