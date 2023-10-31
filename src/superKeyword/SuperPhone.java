package superKeyword;

public class SuperPhone extends Phone {
	int ram;
	int rom;
	
	public SuperPhone() {
		System.out.println("I have superphone");
	}
	public void ram() {
		ram=8;
		System.out.println("The ram of superphone="+ram);
	}
	public void rom() {
		rom=512;
		System.out.println("The rom of superphone="+rom);
	}
	public void display() {
		this.ram();
		super.ram();
		System.out.println(".......");
		this.rom();
		super.rom();
	}

}
