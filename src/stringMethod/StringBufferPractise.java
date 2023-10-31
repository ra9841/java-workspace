package stringMethod;

public class StringBufferPractise {

	public static void main(String[] args) {
	//final StringBuffer sb=new StringBuffer("rabin");//by declaring final we cannot make stringbuffer as immutable
	 StringBuffer sb=new StringBuffer("rabin");//It is impossible to make StringBufffer immutable
		sb.append(" shrestha");
		System.out.println(sb);
		sb=new StringBuffer("rahul");
		System.out.println(sb);
		
		//method of StringBuffer
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		//System.out.println(sb.charAt(10));//StringIndexOutOfBoundsException
		
		StringBuffer sbf=new StringBuffer();//overloaded method in stingBuffer
		sbf.append("hello my name is rabin");
		sbf.append(true);//append always add last
		sbf.append(1.223);
		sbf.append(222);
		sbf.insert(2,false);//insert we can add anywhere
		sbf.insert(10,"to be continue");
		sbf.delete(2,7);//began  to end-1
		System.out.println(sbf);
		

	}

}
