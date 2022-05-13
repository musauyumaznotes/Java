package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


import kodlamaio.hrms.core.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_seekers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name ="user_id",referencedColumnName = "id")
public class JobSeeker extends User{
	
	

	@NotBlank
	@NotNull
	@Column(name="name")
	private String name;
	
	@NotBlank
	@NotNull
	@Column(name="surname")
	private String surname;
	
	@NotBlank
	@NotNull
	@Size(min =11, max=11)
	@Column(name="national_identity")
	private String nationalIdentity;
	
	@NotBlank
	@NotNull
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerActivation>jobSeekerActivations;
	
	
}
