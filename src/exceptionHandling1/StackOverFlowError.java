package exceptionHandling1;

public class StackOverFlowError {
	
	public void m1() {
		m2();//this calling m2 method
	}
	public void m2() {
		m1();//this calling m1 method
	}

	public static void main(String[] args) {
		StackOverFlowError sk=new StackOverFlowError();
		sk.m1();//StackOverFlowError
		//calling on and on

	}

}
