package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_advertisements_dto_view")
public class JobAdvertisementDto {
	
	@Id
	private int jobAdvertisementId;
	
	@NotBlank
	@NotNull
	private String companyName;
	
	@NotBlank
	@NotNull
	private String JobPositionName;
	
	@NotBlank
	@NotNull
	private int openPositionCount;
	
	
	@NotBlank
	@NotNull
	private LocalDate applicationDeadline;
	
	@NotBlank
	@NotNull
	private LocalDate createdAt;
	

}
