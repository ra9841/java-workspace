package stringPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberPattern {

	public static void main(String[] args) {
		String phone="510-646-3263";
		
		// Define a regular expression pattern to match the date format
        Pattern pattern = Pattern.compile("(\\d{3})-(\\d{3})-(\\d{4})");
        
     // Create a Matcher object to search for the pattern in the string
        Matcher matcher = pattern.matcher(phone);
        
     // If the pattern is found, extract the year, month, and day
        if (matcher.find()) {
          System.out.println("right");
        }else {
        	System.out.println("wrong");
        }

	}

}
