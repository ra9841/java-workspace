package exceptionHandling1;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		int z=0;
		
		try {
		 z=x/y;
		System.out.println("Divisiable of x and y="+z);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Hey user it will not divide by zero");
			}
		catch(Exception e) {
			System.out.println("divisable");
			}
		finally {
			System.out.println("It will printed");
		}

	}

}
