package downcasting;

public class MainClass {

	public static void main(String[] args) {
		Dog d;
		    d=new Dog();
		    d.run();
		    
		System.out.println("......");
		d=new BarkDog();          //up casting
		d.run();
		
	//	System.out.println(".....");
		//d=new SleepDog();          //up casting
		//d.run();
		
		System.out.println(".....");
		BarkDog bd=(BarkDog)d;      //down casting
		bd.run();
		bd.bark();
		bd.Walk();
		
		

	}

}
