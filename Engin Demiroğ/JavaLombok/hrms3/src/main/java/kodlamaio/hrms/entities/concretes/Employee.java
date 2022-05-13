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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@EqualsAndHashCode(callSuper = false)
@JsonPropertyOrder({"id","name","surname"})
@PrimaryKeyJoinColumn(name = "user_id" ,referencedColumnName = "id")
public class Employee extends User{
	
	@NotBlank
	@NotNull
	@Column(name="name")
	private String name;
	 
	@NotBlank
	@NotNull
	@Column(name="surname")
	private String surname;
	
	@JsonIgnore()
	@OneToMany(mappedBy = "employee")
	private List<EmployeeConfirm> employeeConfirms;
	
	
}
