package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzSolution {

    public static String fizzBuzz(Integer number) {
    	
    	if(number <1 || number>9999) {
    		return "Illegal Input";
    	}
    	
    	
    	String response = number.toString();
    	boolean fizzTrue = false;
    	boolean buzzTrue = false;
    	boolean deluxeTrue = false;
    	String pattern = "^([0-9])\\1*$";//str.matches("([0-9]){6}")
    	Pattern p = Pattern.compile(pattern);
    	Matcher m = p.matcher(number.toString());
    	if(number>10 && m.matches()) {
    		if(number%2!=0) {
    			response = "fake deluxe";
    		} else {
    			response = "deluxe";
    		}
    		
    		deluxeTrue = true;
    	}
    	
    	
    	
    	if(number%5 == 0 || Integer.valueOf(number).toString().indexOf("5") != -1) {
    		response = "buzz";
    		buzzTrue = true;
    		if(deluxeTrue) {
    			response = "buzz deluxe";
    		}
    	}
    	
    	if(number%3 == 0 || Integer.valueOf(number).toString().indexOf("3") != -1) {
    		response = "fizz";
    		fizzTrue = true;
    		if(deluxeTrue) {
    			response = "fizz deluxe";
    		}
    	}
    	
    	//if(number>10 && number.)
    	
    	if(fizzTrue && buzzTrue) {
    		if(deluxeTrue) {
    			response = "fizz buzz deluxe";
    		} else {
    			response = "fizz buzz";
    		}
    	}
    	
        return response;
    }
    
    public static void main (String[] args) {
    	//11 22 1111
    	String response = fizzBuzz(555);
    	System.out.println(response);
    }

}
