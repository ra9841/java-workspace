package exceptionHandling1;

public class IllegalArgumentException {
	
	public static void main(String[] args) {
		Thread t=new Thread();
		t.setPriority(10);//IllegalArgumentException
		t.setPriority(100);//IllegalArgumentException
		
	}

}
