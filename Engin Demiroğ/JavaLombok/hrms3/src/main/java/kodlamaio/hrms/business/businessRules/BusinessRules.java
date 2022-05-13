package kodlamaio.hrms.business.businessRules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

@Service
public class BusinessRules {

	@Autowired
    public static Result Run(Result... results)
    {		
        for (Result result : results) {
             if (!result.isSuccess())
            {
                return result;
            }
        }
      
     
         return new SuccessResult();
           
       
    }
}


