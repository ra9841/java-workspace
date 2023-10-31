package stringPattern;

public class Zipcode {

	public static void main(String[] args) {
		String name = "94806";
		String first = "0";
		if (name.startsWith(first) || name.length() > 5) {
			System.out.println("wrong");
		} else {
			System.out.println(name);

		}

	}

}