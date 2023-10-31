package stringMethod;

public class StringDemo {

	public static void main(String[] args) {
		String name="Rabin";                   //store in internal memory
		String name1="Rahul";                   //store in internal memory
		String name2="Rabin";                    //store in internal memory
		String name3=new String("Rabin");       //store in heap momory
		String name4=new String("Rabin");       //store in heap memory
	
		System.out.println(name==name1);
		System.out.println(name1==name2);
		System.out.println(name==name2);          //share same memory
		System.out.println(name==name3);
		System.out.println(name3==name4);
		
		

		
		
	}

}
