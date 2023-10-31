package exceptionHandling1;

public class ArrayIndexOutOfBoundExceptionPractise {

	public static void main(String[] args) {
		int[] a=new int[10];
		
		System.out.println(a[2]);
		System.out.println(a[0]);
		System.out.println(a[22]);//ArrayIndexOutOfBoundsException
		

	}

}
