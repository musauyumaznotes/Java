package test.hrms2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import test.hrms2.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

	Candidate findByIdentificationNumber(String identificationNumber);
}
