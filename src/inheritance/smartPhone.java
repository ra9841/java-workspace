package inheritance;

public class smartPhone extends Mobile{
	int imei;
	String name;
	int price;
	String logo;
	
	public void imei() {
		imei=12345;
		System.out.println("The imei number of smartphone="+ imei);
	}
	
	public void name() {
		name="Applepromax";
		System.out.println("The name of smartphone="+ name);
	}
	
	public void price() {
		price=900;
		System.out.println("The price of smartphone="+ price);
	}
	
	public void logo() {
		logo="Apple";
		System.out.println("The logo of samrtphone="+ logo);
	}
	

}
