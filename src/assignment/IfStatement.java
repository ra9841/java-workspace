package assignment;

public class IfStatement {

	public static void main(String[] args) {
		int year=2016;
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("common year");
		}
		
		int marks=80;
		if((marks>=35) && (marks<=100)){
			System.out.println("pass");
		}
			else{
				System.out.println("fail");
			}
			
		}
	}


