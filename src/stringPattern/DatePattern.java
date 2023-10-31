package stringPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatePattern {

	public static void main(String[] args) {
        String date = "2023-04-21";

        // Define a regular expression pattern to match the date format
        Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");

        // Create a Matcher object to search for the pattern in the string
        Matcher matcher = pattern.matcher(date);

        // If the pattern is found, extract the year, month, and day
        if (matcher.find()) {
            System.out.println("right");
        }else {
        	System.out.println("wrong");
        }
    }
}







