package staticblock;

public class Country {
	static String NationalAnthem="Americansong";
	static int population;
	String name="America";
	int states;
	int city;
	static {
		System.out.println("Hey you belong to a very Beautiful country");
	}
	public Country(String name,String NationalAnthem) {
		this.name=name;
	     this.NationalAnthem=NationalAnthem;
		
	}
	public void info(String name) {
		name="India";
		System.out.println(name);
		name=this.name;
		System.out.println(name);
	}
	public void info1(String name) {
		name="Nepal";
		System.out.println(name);
		name=this.name;
		System.out.println(name);
	}
	public static void main(String[]args) { 
		Country in=new Country("name","NationalAnthem");
		Country on=new Country("India","Nepal");
		on.info("name");
		on.info1("name");
		System.out.println(in.name +" "+ in.NationalAnthem);
	}

		
	

}
