package exceptionHandling1;

public class ClassCastException {
//Object is parent and String is child
	public static void main(String[] args) {
		String st=new String("rabin");
		Object o=(Object)st;//child class ,we can type cast to parent
		System.out.println(o);
		
		Object o1=new Object();
		String s=(String)o1;//object to string type casting
		System.out.println(s);//ClassCastException
		
		

	}

}
