package kodlamaio.hrms.core.adapters.codeGenerator;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class CodeGeneratorManager implements CodeGeneratorService{

	@Override
	public void sendActivationCode() {
		toStringCode();
		String activationLink = "https://activationCodeForEmail"+ toStringCode();
		
	}

	@Override
	public String toStringCode() {
		UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		return activationCode;
	}

}
