package stringPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex {
	 public static void main(String[] args) {
         // Define a regular expression pattern
        // String pattern = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
          // String pattern ="^%(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" ;
		 String pattern ="(?=.*[a-z])";
         // Create a Pattern object
         Pattern regex = Pattern.compile(pattern);

         // Use the Matcher class to test if a string matches the pattern
         String email = "adfgfd";
         Matcher matcher = regex.matcher(email);

         if (matcher.matches()) {
             System.out.println("The email is valid");
         } else {
             System.out.println("The email is invalid");
         }
     }
 }


