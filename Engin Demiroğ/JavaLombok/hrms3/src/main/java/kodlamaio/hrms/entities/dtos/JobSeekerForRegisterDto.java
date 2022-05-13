package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerForRegisterDto {
	
	@NotBlank
	@NotNull
	@Email
	private String email;
	
	@NotBlank
	@NotNull
	private String password;
	
	@NotBlank
	@NotNull
	private String passwordAgain;
	
	@NotBlank
	@NotNull
	private String name;
	
	@NotBlank
	@NotNull
	private String surname;
	
	@NotBlank
	@NotNull
	private String nationalIdentity;
	
	@NotBlank
	@NotNull
	private LocalDate dateOfBirth;
}
