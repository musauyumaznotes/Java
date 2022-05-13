package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms.entities.concretes.EmployerActivation;

public interface EmployerActivationDao extends JpaRepository<EmployerActivation, Integer>{
	EmployerActivation findByIsActivatedAndEmployerId(boolean isActivated ,int employerId);
	EmployerActivation findByIsCodeConfirmedAndEmployerId(boolean isConfirmedCode ,int employerId);
}