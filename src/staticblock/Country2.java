package staticblock;

public class Country2 {
	static String NationalAnthem="Americansong";
	static int population=20000;
	String name="America";
	static  int states=55;
	String city="SanFrancisco";
	static {
		System.out.println("Hey you belong to a very Beautiful country");
	}
	public Country2(String name,String NationalAnthem) {
		name=name;
		NationalAnthem=NationalAnthem;
		}

	public Country2(String name,int states,String NationalAnthem) {
		name=name;
		states=states;
		NationalAnthem=NationalAnthem;
	}
	public Country2(String name,String city,String NationalAnthem,int population) {
		name=name;
		NationalAnthem=NationalAnthem;
		population=population;
		}
	public void world(String name) {
		name="Nepal";
		System.out.println(name);
		name=this.name;
		System.out.println(name);
	}
	public void world1(String name) {
		name="India";
		System.out.println(name);
		name=this.name;
		System.out.println(name);
		}
	public void world2(String NationalAnthem) {
		NationalAnthem="song";
		System.out.println(NationalAnthem);
		NationalAnthem=this.NationalAnthem;
		System.out.println(NationalAnthem);
	}
	public void info(String name){
		name="Nepal";
		System.out.println(name);
	    name=this.name;
		System.out.println(name);
	}
	public void info2(int states) {
		states=25;
		System.out.println(states);
		states=this.states;
		System.out.println(states);
	}
	public void info3(String NationalAnthem) {
		NationalAnthem="Nepalisong";
		System.out.println(NationalAnthem);
		NationalAnthem=this.NationalAnthem;
		System.out.println(NationalAnthem);
	}
	public void hello(String name) {
		name="India";
		System.out.println(name);
		name=this.name;
		System.out.println(name);
	}
	public void hello1(String city) {
		city="Banglore";
		System.out.println(city);
		city=this.city;
		System.out.println(city);
	}
	public void hello2(String NationalAnthem) {
		NationalAnthem="Indiansong";
		System.out.println(NationalAnthem);
		NationalAnthem=this.NationalAnthem;
		System.out.println(NationalAnthem);
	}
	public void hello3(int population) {
		population=10000;
		System.out.println(population);
		population=this.population;
		System.out.println(population);
		}
	public static void main(String[]args) {
		Country2 by=new Country2("name","NatioanlAnthem");
		by.world("name");
		by.world1("name");
		by.world2("NationalAnthem");
		System.out.println("name and nationalanthem="+ by.name+" "+ by.NationalAnthem);
		Country2 co=new Country2("name",states,"Nationalanthem");
		Country2 co1= new Country2("Nepal",25,"Nepalisong");
		co1.info("name");
		co1.info2(states);
		co.info3("NationalAnthem");
		System.out.println("The country,states and nationalanthem =" + co.name +" "+ co.states +" " +co.NationalAnthem +" ");
		Country2 hi=new Country2("name","city","NationalAnthem",population);
		Country2 hi1=new Country2("India","Banglore","Indiansong",10000);
		hi1.hello("name");
		hi1.hello1("city'");
		hi1.hello2("NationalAnthem");
		hi1.hello3(population);
		System.out.println("country,city,nationalanthem and population=" + hi.name +" "+ hi.city+ " "+ hi.NationalAnthem +" "+hi.population);
				

		
	}
	
}
