package overridingWithVariable;

public class MainClass {

	public static void main(String[] args) {
		Parent p=new Parent();//parent refrence
		System.out.println(p.name);
		
		Child c= new Child();//child refrence
		System.out.println(c.name);
		
		Parent p1=new Child();//parent refrence
		System.out.println(p1.name);
		
		

	}

}
