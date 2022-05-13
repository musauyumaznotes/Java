package kodlamaio.hrms.entities.dtos;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerForRegisterDto {
	@NotBlank
	@NotNull
	@Email
	@NotEmpty
	private String email;
	
	@Size(min = 8,max = 16)
	@NotBlank
	@NotNull
	@NotEmpty
	private String password;
	
	@NotBlank
	@NotNull
	@NotEmpty
	private String passwordAgain;
	
	@Size(min=2,max=100)
	@NotBlank
	@NotNull
	@NotEmpty
	private String companyName;
	
	@NotBlank
	@NotNull
	@NotEmpty
	private String webAddress;
}
