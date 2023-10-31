package exceptionHandling2;

public class TryCatchFinallyPractise {//try putting (10/0) condition and knows flow

	public static void main(String[] args) {
		
		System.out.println("step 1");
		System.out.println("step 2");
		System.out.println("step 3");
		try {
			System.out.println("step 4");
			System.out.println("step 5");
			System.out.println(10/0);
			try {
				System.out.println("step 7");
				System.out.println("step 8");
			}
		catch(Exception e) {
			System.out.println("step 9");
		}finally {
			System.out.println("step 10");
		}
		System.out.println("step 11");
		
		}catch (Exception e){
			System.out.println("step 12");
		}finally {
			System.out.println("step 13");
		}
		System.out.println("step 14");

	}

}
