package hashCode;

public class MainClass {

	public static void main(String[] args) {
	Car ca=new Car("Toyota",20000,"White");
	System.out.println(ca.hashCode());
	
	Car ca1=new Car("Tesla",40000,"Silver");
	System.out.println(ca1.hashCode());
	
	Car ca3=new Car("Toyota",20000,"White");
	System.out.println(ca3.hashCode());
	
	Car ca4=new Car("Tesla",40000,"Silver");
	System.out.println(ca4.hashCode());
	
	Car ca5=new Car("Honda",30000,"Silver");
	System.out.println(ca5.hashCode());
	
	System.out.println(ca.equals(ca3));
	System.out.println(ca.equals(ca1));


	}

}
