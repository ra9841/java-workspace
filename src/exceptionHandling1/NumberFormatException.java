package exceptionHandling1;

public class NumberFormatException {

	public static void main(String[] args) {
		//int i=Integer.parseInt("10");
		int j=Integer.parseInt("ten");//NumberFormatException
		//System.out.println(i);
		System.out.println(j);

	}

}
