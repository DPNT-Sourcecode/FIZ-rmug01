package befaster.solutions.FIZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FizzBuzzSolution {

    public static String fizzBuzz(Integer number) {
    	
    	String pattern = "([0-9])";//str.matches("([0-9]){6}")
    	Pattern p = Pattern.compile(pattern);
    	Matcher m = p.matcher(number.toString());
    	System.out.println(m.find());
    	if(number <1 || number>9999) {
    		return "Illegal Input";
    	}
    	String response = number.toString();
    	boolean fizzTrue = false;
    	boolean buzzTrue = false;
    	
    	if(number%5 == 0 || Integer.valueOf(number).toString().indexOf("5") != -1) {
    		response = "buzz";
    		buzzTrue = true;
    	}
    	
    	if(number%3 == 0 || Integer.valueOf(number).toString().indexOf("3") != -1) {
    		response = "fizz";
    		fizzTrue = true;
    	}
    	
    	//if(number>10 && number.)
    	
    	if(fizzTrue && buzzTrue) {
    		response = "fizz buzz";
    	}
    	
        return response;
    }
    
    public static void main (String[] args) {
    	//13 43 163
    	String response = fizzBuzz(111);
    	System.out.println(response);
    }

}
