package assignment;

public class FoorLoop {

	public static void main(String[] args) {
		//program to find factorial of given number
		int num=10;
		long fract=1;
		for(int i=1;i<=num;i++) {
			System.out.println(i);
			fract=fract*i;
			
			}
		System.out.println("fractional number=" + fract);

		
		//program to find sum of natural number
		
		long natural =0;
		int numb=100;
		for(int i=1;i<=numb;i++) {
			natural=natural + i;
		}
		System.out.println("The natural number=" + natural);
	}

}
