package exceptionHandling2;

public class ThrowsPractise3 {
	
	ThrowsPractise3()throws Exception{//constructor
		
	}
	
	public void m1() {//method  throws Exception.we are using throws exception in main method and calling method then
		              //no need of throws exception in method
		System.out.println("I am method");
	}
//method and constructor will be called by someone but not classes.so no throws Exception for class
	//we can only use throws key for throwable class
	
	public static void main(String[] args) throws Exception {
		ThrowsPractise3 tp=new ThrowsPractise3();
		tp.m1();

	}

}
