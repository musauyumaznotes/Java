package kodlamaio.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers_activations")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "activation_id",referencedColumnName = "id")
public class EmployerActivation extends ActivationCode{
	//private int employerId;
	//private int employeeConfirmId;
	
	
	@NotNull
	@NotBlank
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	
	@NotNull
	@NotBlank
	@ManyToOne()
	@JoinColumn(name="employee_confirm_id")
	private EmployeeConfirm employeeConfirm;
}
