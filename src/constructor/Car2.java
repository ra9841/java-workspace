package constructor;

public class Car2 {
	String color;
	String brand;
	long price;
	public Car2() {                         //no parameter
		color="Blue";
		 brand="Toyota";
		 price=20000;
	}
	public Car2(long a,String b) {          //with parameter        
		price=a;
		brand=b;
	}
	public Car2(long a,String b,String c ) {    //with parameter
		price=a;
		brand=b;
		color=c;
	}
	public static void main(String[]args) {
		Car2 cr2=new Car2(2000,"Honda","Blue");
		System.out.println("price=" + cr2.price);
		System.out.println("brand="+ cr2.brand);
		System.out.println("color="+ cr2.color);
		Car2 cr3=new Car2(20000,"Toyota");
		System.out.println("price" + cr3.price);
		System.out.println("brand"+ cr3.brand);
		Car2 cr=new Car2();
		System.out.println(cr.color+" "+cr.brand+" "+cr.price);
		
		
	}
	

}
