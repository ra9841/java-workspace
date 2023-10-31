package objectTypeCasting;

public class Practise {

	public static void main(String[] args) {//1.(StringBuffer)o- o can change to stringbuffer(compile time checking)
		Object o=new StringBuffer("rabin");
		StringBuffer sb=(StringBuffer)o;
		System.out.println(sb);
		
		Object o1=new String("rabin");
		String sb1=(String)o1;
		System.out.println(sb1);

	}

}
