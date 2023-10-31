package throwThrowsException;

import java.util.Scanner;

public class Result {

	public static void Yourresult() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks=");
		int result=sc.nextInt();
		sc.close();
		
		if(result<45) {
			Exception exc=new Exception("Your marks is below level");
			throw exc;
		}
		else {
			System.out.println("You are pass");
		}
	}
		
	public static void Car() throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand of car=");
		String brand=sc.nextLine();
		sc.close();
		if(brand.equals("Toyota")) {
			Exception exc=new Exception("This is not good brand");
			throw exc;
				}
		else {
			System.out.println("This is good brand");
		}
		}
      public static void main(String[] args) throws Exception {
		try {
			Yourresult();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    // */	Car();

	}

}
