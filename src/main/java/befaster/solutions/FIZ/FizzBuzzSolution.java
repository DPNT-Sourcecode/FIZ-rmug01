package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzSolution {

    public static String fizzBuzz(Integer number) {
    	
    	if(number <1 || number>9999) {
    		return "Illegal Input";
    	}
    	
    	
    	String response = number.toString();
    	String deluxeResponse = "";
    	boolean fizzTrue = false;
    	boolean buzzTrue = false;
    	boolean deluxeTrue = false;
    	boolean fakeDeluxeTrue = false;
    	boolean fizzbuzzdeluxetrue = false;
    	boolean fizzbuzzfakedeluxetrue = false;
    	String pattern = "^([0-9])\\1*$";//str.matches("([0-9]){6}")
    	Pattern p = Pattern.compile(pattern);
    	Matcher m = p.matcher(number.toString());
    	if(number>10 && m.matches()) {
    		if(number%2!=0) {
    			deluxeResponse = "fake deluxe";
    			fakeDeluxeTrue = true;
    		}
    		//deluxeTrue = true;
    		response = deluxeResponse;
    		
    	}
    	
    	if (number%5 == 0 && Integer.valueOf(number).toString().indexOf("5") != -1 ) {
    		deluxeTrue = true;
    	}
    	if (number%3 == 0 && Integer.valueOf(number).toString().indexOf("3") != -1 ) {
    		deluxeTrue = true;
    	}
    	
    	if(number%5 == 0 || Integer.valueOf(number).toString().indexOf("5") != -1 ) {
    		response = "buzz";
    		buzzTrue = true;
    	}
    	
    	if(number%3 == 0 || Integer.valueOf(number).toString().indexOf("3") != -1 ) {
    		response = "fizz";
    		fizzTrue = true;
    	}
    	
    	if(fizzTrue && buzzTrue && (Integer.valueOf(number).toString().indexOf("5") != -1 || Integer.valueOf(number).toString().indexOf("3") != -1)) {
    		if(number%2!=0 && deluxeTrue) {
    			fizzbuzzfakedeluxetrue = true;
    		}  else if (deluxeTrue){
    			fizzbuzzdeluxetrue = true;
    		}
    		
    		
    	}
    	
    	if(number%5 == 0) {
    		if(Integer.valueOf(number).toString().indexOf("5") != -1 ) {
    			if(fakeDeluxeTrue || number%2!=0) {
    				response = "buzz fake deluxe";
    			} else{
    				response = "buzz deluxe";
    			}
    		} else {
	    		response = "buzz";
	    		if(fakeDeluxeTrue) {
	    			deluxeResponse = "fake deluxe";
	    		}/* else if(deluxeTrue && !(Integer.valueOf(number).toString().indexOf("5") != -1 )) {
	    			deluxeResponse = "deluxe";
	    		}*/
	    		response = response+" "+deluxeResponse;	    		
	    		/*if(deluxeTrue) {
	    			response = "buzz "+deluxeResponse;
	    		}*/
    		}
    		buzzTrue = true;
    	}
    	
    	if(number%3 == 0 ) {
    		if(Integer.valueOf(number).toString().indexOf("3") != -1) {
    			if(fakeDeluxeTrue  || number%2!=0) {
    				response = "fizz fake deluxe";
    			} else{
    				response = "fizz deluxe";
    			}
    		} else {
    			response = "fizz";
        		if(fakeDeluxeTrue) {
        			deluxeResponse = "fake deluxe";
        		}/* else if(deluxeTrue && !(Integer.valueOf(number).toString().indexOf("3") != -1 )){
        			deluxeResponse = "deluxe";
        		}*/
        		response = response+" "+deluxeResponse;        		
        		/*if(deluxeTrue) {
        			response = "fizz "+deluxeResponse;
        		}*/
    		}   
    		fizzTrue = true;
    	}
    	
    	if(fizzTrue && buzzTrue) {
    		response = "fizz buzz";  
    		if(fizzbuzzdeluxetrue) {
    			response = "fizz buzz deluxe"; 
    		} else if (fizzbuzzfakedeluxetrue) {
    			response = "fizz buzz fake deluxe"; 
    		}
    	}
    	
        return response.trim();
    }
    
    public static void main (String[] args) {
    	//30 3510 15
    	String response = fizzBuzz(15);
    	System.out.println(response);
    }

}
