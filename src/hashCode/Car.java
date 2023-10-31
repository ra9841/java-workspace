package hashCode;

import java.util.Objects;

public class Car {
	String brand;
	int price;
	String color;
	public Car() {
		super();
	}
	public Car(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, color, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && price == other.price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
	

}
