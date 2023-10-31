package constructor;

public class Car{
	String color;
	String brand;
	long price;	
	public Car() {                         //no parameter
		color="blue";
		 brand="Toyota";
		 price=20000;
	}
	public static void main(String[]args) {
		Car cr= new Car();
		System.out.println("color ="+ cr.color);
		System.out.println("brand= "+ cr.brand);
		System.out.println("price= "+ cr.price);
	}
 }


	
	
	
	
	
	



