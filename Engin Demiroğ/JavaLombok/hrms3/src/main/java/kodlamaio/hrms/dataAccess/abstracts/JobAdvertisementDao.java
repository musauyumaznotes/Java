package kodlamaio.hrms.dataAccess.abstracts;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fasterxml.jackson.annotation.JsonView;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;



public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
//	List<JobAdvertisementDto>getByIsActivatedTrue(boolean isActive);
//	List<JobAdvertisementDto>getIsActiveTrueAndEmployerId(boolean isActive,String CompanyName);
//	@JsonView(JobAdvertisement.class)
//	@Query(value = querry1)
//	List<JobAdvertisement>getJobAdvertisements();
//	
//	String querry1 = "Select companyName from job_advertisements_dto_view";

}
