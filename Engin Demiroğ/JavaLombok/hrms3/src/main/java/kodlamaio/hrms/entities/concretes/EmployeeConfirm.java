package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_confirms")
@JsonPropertyOrder({"id","confirmedDate","isConfirmed"})
public class EmployeeConfirm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
//	@Column(name = "employee_id")
//	private int employeeId;
	
	
	@NotNull
	@NotBlank
	@Column(name= "is_confirmed")
	private boolean isConfirmed;
	

	@NotNull
	@NotBlank
	@Column(name="confirmed_date")
	private LocalDate confirmedDate;
	
	
	@NotNull
	@NotBlank
	@ManyToOne()
	@JoinColumn(name = "employee_id") 
	private Employee employee;
	
	
	//
	@JsonIgnore()
	@OneToMany(mappedBy = "employeeConfirm")
	private List<EmployerActivation>employerActivations;
}
