package test.hrms2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import test.hrms2.entities.abstracts.User;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="verification_codes")
public class VerificationCode extends User{

	@Column(name = "code")
	private String code;
	
	@Column(name = "is_verified")
	private boolean isVerified;
}
