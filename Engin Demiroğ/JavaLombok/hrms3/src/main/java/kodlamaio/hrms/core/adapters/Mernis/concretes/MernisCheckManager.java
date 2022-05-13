package kodlamaio.hrms.core.adapters.Mernis.concretes;

import kodlamaio.hrms.core.adapters.Mernis.abstracts.MernisCheckService;

public class MernisCheckManager<T> implements MernisCheckService<T>{

	@Override
	public boolean checkIfRealPerson(T Entity) {
		
		return true;
	}

}
