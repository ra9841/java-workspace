package assignment;

public class DataType {

	public static void main(String[] args) {
		int num1=50;
		int num2=10;
		int radius=7;
		int sum=num1 + num2;
		int sub=num1 - num2;
		int mul=num1 * num2;
		int div=num1 / num2;
		int ave=(num1 + num2)/2;
		//length=num1 and wide=num2
		int perimeter=2 * (num1 + num2);
		int area=num1 * num2;
		double areacricle=3.14 * radius * radius;
		double circum= 2 *3.14 *radius;
		System.out.println("The sum of the number=" + sum);
		System.out.println("The subtraction of the number=" + sub);
		System.out.println("The multipliciation of the number=" + mul);
		System.out.println("The division of the number=" + div);
		System.out.println("The average of the number=" + ave);
		System.out.println("The peremiter of rectangle=" + perimeter);
		System.out.println("The area of rectangle=" + area);
		System.out.println("The area of circle=" + areacricle);
		System.out.println("The circumference of circle=" + circum);

	}

}
