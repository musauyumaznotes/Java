package kodlamaio.hrms.api.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ActivationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.ActivationCode;

@RestController
@RequestMapping("/api/activationcodes")
public class ActivationCodesControllers {
	private ActivationCodeService activationCodeService;

	@Autowired
	public ActivationCodesControllers(ActivationCodeService activationCodeService) {
		super();
		this.activationCodeService = activationCodeService;
	};
	@GetMapping("/getbyisactivated")
	public DataResult <List<ActivationCode>> getByIsActivated(@RequestParam boolean isActivated){
		return activationCodeService.getByIsActivated(isActivated);
	}
	@GetMapping("/getbyiscodeconfirmed")
	public DataResult<List<ActivationCode>> getByIsCodeConfirmed(@RequestParam boolean confirmedCode){
		return activationCodeService.getByIsCodeConfirmed(confirmedCode);
	}
}
