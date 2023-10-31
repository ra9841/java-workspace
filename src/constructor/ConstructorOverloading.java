package constructor;
//from one constructor we can call another constructor
public class ConstructorOverloading {
	
	ConstructorOverloading(double d) {
		this(10);//it is calling int arg constructor
		System.out.println("this is double");
	}

	ConstructorOverloading(int i) {
		this();//it is calling no arg constructor
		System.out.println("this is int");
	}

	ConstructorOverloading() {//first no arg constructor will print.Then int and double will print
		System.out.println("this is no arg-constructor");

	}

	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(10.5);
		System.out.println("............................");
		ConstructorOverloading co1=new ConstructorOverloading(10);
		System.out.println("............................");
		ConstructorOverloading co2=new ConstructorOverloading();
		

	}

}
