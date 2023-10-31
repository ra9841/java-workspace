package superKeyword;

public class SmartPhone extends SuperPhone{
	int ram;
	int rom;
	public SmartPhone() {
		System.out.println("I have smartphone");
	}
	public void ram() {
		ram=2;
		System.out.println("The ram of smartphone="+ram);
	}
	public void rom() {
		rom=126;
		System.out.println("The rom of smart phone="+rom);
	}
	public void display() {
		this.ram();
		super.ram();
		System.out.println("......");
		this.rom();
		super.rom();
		
		
	}

}
