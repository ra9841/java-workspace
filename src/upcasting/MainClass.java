package upcasting;

public class MainClass {

	public static void main(String[] args) {
		Drink co;
		     co=new Drink();
		     co.coke();
		     co.sprite();
		     System.out.println(".........");
		     
		     co=new SoftDrink();         //up casting
		     co.coke();                  //Method overriding
		     co.sprite();
		 
		     
		     

	}

}
