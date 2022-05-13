package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import kodlamaio.hrms.core.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"id"})
@PrimaryKeyJoinColumn(name ="user_id",referencedColumnName = "id")
public class Employer extends User{
	
	@NotBlank
	@NotNull
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@NotNull
	@Column(name="web_address")
	private String webAddress;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "employer")
	private List<EmployerActivation>employerActivations;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement>jobAdvertisements;
}
