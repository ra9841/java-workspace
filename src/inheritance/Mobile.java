package inheritance;

public class Mobile {
	int keypad;
	String color;
	String brand;
	String model;
	
	public void keypad() {
		keypad=13;
		System.out.println("The keypad on mobile=" + keypad);
		}
	
	public void color() {
		color="black";
		System.out.println("The color of mobile="+ color);
	}
	
	public void brand() {
		brand= "Iphone";
		System.out.println("The brand of mobile="+ brand);
	}
	public void model() {
		model="Iphone14";
		System.out.println("The model of mobile="+ model);
	}
	
	

}
