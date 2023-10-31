package comparableComparatorAndSort;

public class Fruit implements Comparable<Fruit> {
    int price;
    String name;
    String color;
	
    public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [price=" + price + ", name=" + name + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Fruit o) {
		
	//int x=this.price-o.price; //ascending order
	//descending order
	int x=o.price-this.price;
		return x;
	}
    
    
    
	
	
}
