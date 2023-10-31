package exceptionHandling2;
//if we r using extends Exception then in main method we have to use throws TooYoungException
//if we r extends using RuntimeException then no need of throws TooYoungException.This is best practise
class TooYoungException extends RuntimeException{//this is different class to handle exception
	TooYoungException(String message){
		super(message);//we are passing this message to super class.To make discription available to throwable class
	}
}

class TooOldException extends RuntimeException{//this is different class to handle exception
	TooOldException(String message){
		super(message);
	}
}

public class CustomeExceptionPractise {

	public static void main(String[] args){
		
		int age=77;
		
		if(age>60) {
			throw new TooYoungException("plz wait some time");//throw keword is used to make customize exception
			
		}else if(age<18) {
			throw new TooOldException("your age matter");
			
		}else {
			System.out.println("thanks");
		}

	}

}
