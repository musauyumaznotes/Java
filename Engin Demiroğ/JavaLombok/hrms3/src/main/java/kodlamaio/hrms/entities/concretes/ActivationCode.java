package kodlamaio.hrms.entities.concretes;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="activation_codes")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonPropertyOrder({"id","code"})
public class ActivationCode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name = "code")
	private String code;
	
	
	
	@NotBlank
	@NotNull
	@Column(name = "is_code_confirmed")
	private boolean isCodeConfirmed;
	
	
	
	@NotBlank
	@NotNull
	@Column(name = "is_activated")
	private boolean isActivated;

	
	
	@NotBlank
	@NotNull
	@Column(name = "last_approval_time")
	private LocalDateTime lastApprovalTime;
	
	
	
	
		
	
}
