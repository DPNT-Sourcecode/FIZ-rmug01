package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
    	if(number <1 || number>9999) {
    		return "Illegal Input";
    	}
    	String response = null;
    	
    	if(number%3 == 0) {
    		if(number%5 == 0) {
    			response = "fizz buzz";
    		} else {
    			response = "fizz";
    		}
    	}
    	if(number%5 == 0) {
    		response = "buzz";
    	}
    	if(number%3 != 0 && number%5 != 0) {
    		response = number.toString();
    	}
    	
        return response;
    }

}
