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
    	String pattern = "^([0-9])\\1*$";//str.matches("([0-9]){6}")
    	Pattern p = Pattern.compile(pattern);
    	Matcher m = p.matcher(number.toString());
    	if(number>10 && m.matches()) {
    		if(number%2!=0) {
    			deluxeResponse = "fake deluxe";
    			fakeDeluxeTrue = true;
    		} else {
    			deluxeResponse = "deluxe";
    			deluxeTrue = true;
    		}
    		response = deluxeResponse;
    		
    	}
    	
    	
    	
    	if(number%5 == 0 || Integer.valueOf(number).toString().indexOf("5") != -1) {
    		response = "buzz";
    		if(fakeDeluxeTrue) {
    			deluxeResponse = "fake deluxe";
    		} else {
    			deluxeResponse = "deluxe";
    		}
    		response = response+" "+deluxeResponse;
    		buzzTrue = true;
    		/*if(deluxeTrue) {
    			response = "buzz "+deluxeResponse;
    		}*/
    	}
    	
    	if(number%3 == 0 || Integer.valueOf(number).toString().indexOf("3") != -1) {
    		response = "fizz";
    		if(fakeDeluxeTrue) {
    			deluxeResponse = "fake deluxe";
    		} else {
    			deluxeResponse = "deluxe";
    		}
    		response = response+" "+deluxeResponse;
    		fizzTrue = true;
    		/*if(deluxeTrue) {
    			response = "fizz "+deluxeResponse;
    		}*/
    	}
    	
    	if(fizzTrue && buzzTrue) {
    		response = "fizz buzz ";  
    		response = response+" "+deluxeResponse;
    	}
    	
        return response;
    }
    
    public static void main (String[] args) {
    	//36 396 936
    	String response = fizzBuzz(936);
    	System.out.println(response);
    }

}
