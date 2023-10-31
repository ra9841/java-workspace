package methodOverloading;

public class DemoMethodOverloading {
	public void sum() {
		int num1=20;
		int num2=30;
		int num=num1+num2;
		System.out.println(num);
		}
	public void sum(int x) {
		int num1=50;
		int num2=50;
		int num=num1+num2;
		System.out.println(num);
	}
	public static void main(String[]args) {
		DemoMethodOverloading demo=new DemoMethodOverloading();
		demo.sum();
		demo.sum(9);
	}

}
