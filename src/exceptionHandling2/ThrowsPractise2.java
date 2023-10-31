package exceptionHandling2;

public class ThrowsPractise2 {

	public static void main(String[] args) throws InterruptedException {
		doStuff();//this calling next method
		System.out.println("main");

	}
	
	public static void doStuff() throws InterruptedException {
		doMoreStuff();//this calling next method
		System.out.println("doStuff");//this delegete to main method
	}
	
	public static void doMoreStuff() throws InterruptedException {
		Thread.sleep(1000);//handle exception.Due to this all method should handle exception
		System.out.println("doMoreStuff");//this delegete to doStuff method
	}

}
