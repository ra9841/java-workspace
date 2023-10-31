package staticKeyword;

public class Mobile {
      String name;
      static String color;
      static String brand;
      int price;
      public Mobile(String name, String color) {
    	  this.name=name;
    	  this.color=color;
      }
         
   public Mobile(String name,String color,String brand,int price) {
	   this.name=name;
	   this.color=color;
	   this.brand=brand;
	   this. price=price;
	   
   }
 public static void main(String[]args) {
	 Mobile mob=new Mobile("Hero","Yello");
	 Mobile mob1=new Mobile("Iphone","Blue","Apple",200);
	 Mobile mob2=new Mobile("Android","Silver","Samsung",150);
	 Mobile mob3=new Mobile("Motorola","Pink","Motorolahigh",100);
	 System.out.println("Name and color=" + mob.name +" "+mob.color);
	 System.out.println("Name, color,brand and price of mobile=" + mob1.name+ "  "+ mob1.color+ " "+ mob1.brand+ " "+mob1.price);
	 System.out.println("Name, color,brand and price of mobile=" + mob2.name+ "  "+ mob2.color+ " "+ mob2.brand+ " "+mob2.price);
	 System.out.println("Name, color,brand and price of mobile=" + mob3.name+ "  "+ mob3.color+ " "+ mob3.brand+ " "+mob3.price);
 }
}