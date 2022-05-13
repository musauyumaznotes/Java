package test.hrms2.business.abstracts;

import java.util.List;

import test.hrms2.core.results.DataResult;
import test.hrms2.core.results.Result;
import test.hrms2.entities.concretes.Candidate;

public interface CandidateService {

	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
}
