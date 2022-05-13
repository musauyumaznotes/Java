package kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobSeekerActivation;

public interface JobSeekerActivationDao extends JpaRepository<JobSeekerActivation, Integer>{
	JobSeekerActivation findByIsActivatedAndJobSeekerId(boolean isActivated ,int jobSeekerId);
	JobSeekerActivation findByIsCodeConfirmedAndJobSeekerId(boolean isConfirmedCode ,int jobSeekerId);
}
