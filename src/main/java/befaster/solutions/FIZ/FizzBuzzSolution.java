package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public static String fizzBuzz(Integer number) {
    	if(number <1 || number>9999) {
    		return "Illegal Input";
    	}
    	String response = null;
    	
    	if(number%5 == 0 || Integer.valueOf(number).toString().indexOf("5") != -1) {
    		response = "buzz";
    	}
    	
    	if(number%3 == 0 || Integer.valueOf(number).toString().indexOf("3") != -1) {
    		if(number%5 == 0) {
    			response = "fizz buzz";
    		} else {
    			response = "fizz";
    		}
    	}
    	
    	if(number%3 != 0 && number%5 != 0) {
    		response = number.toString();
    	}
    	
        return response;
    }
    
    public static void main (String[] args) {
    	//15 30 105
    	String response = fizzBuzz(15);
    	System.out.println(response);
    }

}
