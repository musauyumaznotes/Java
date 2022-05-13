package test.hrms2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import test.hrms2.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer> {

	VerificationCode findByCode(String code);
}
