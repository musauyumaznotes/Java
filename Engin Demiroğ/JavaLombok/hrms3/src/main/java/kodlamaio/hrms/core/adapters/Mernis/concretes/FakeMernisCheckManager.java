package kodlamaio.hrms.core.adapters.Mernis.concretes;

import kodlamaio.hrms.core.adapters.Mernis.abstracts.MernisCheckService;

public class FakeMernisCheckManager<Candidate> implements MernisCheckService<Candidate>{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		
		return true;
	}

}
