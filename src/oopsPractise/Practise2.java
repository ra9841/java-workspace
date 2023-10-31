package oopsPractise;

class Practise{
	public void message() {
		System.out.println("rabin");
	}
}

 class Practise2 extends Practise {
	
	 public void message() {
			System.out.println("shrestha");
		}

	public static void main(String[] args) {
		Practise pa=new Practise2();
		pa.message();
		
	

	}

}
