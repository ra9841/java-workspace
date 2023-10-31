package stringMethod;

public class StringDemoFullInforamtion {

	public static void main(String[] args) {
		
		String s1=new String("rabin");//Immutable,has no change behaviour,once created cannot change
		String s2=new String("rabin");
		
		System.out.println(s1==s2);//compare by object/refrence(== operator)
		System.out.println(s1.equals(s2));//compare by content/value
		
		StringBuffer sb1=new StringBuffer("rabin");//Mutable, change behaviour,once created can change
		StringBuffer sb2=new StringBuffer("rabin");
		
		System.out.println(sb1==sb2);//compare by object/refrence(== operator)
		System.out.println(sb1.equals(sb2));//compare by object/refrence
		
		//constructor related to string class
		char[]ch= {'j','a','v','a'};
		String str=new String(ch);
		System.out.println(str);//string is a sequence of character--char arrya of constructor
		
		byte[]by= {97,98,99,100};
		String str1=new String(by);//this will convert to character value
		System.out.println(str1);//byte arrya of constructor
		
		//method related to string class(try and catch exception is used just for fun)
		String name="rabin";
		System.out.println(name.charAt(2));
		try {
			System.out.println(name.charAt(10));//StringIndexOutOfBoundsException
		}catch(Exception e) {
			System.out.println("index is only until 4");
		}
		
		String name1="rabin";
		name1=name1.concat(" shrestha");
		System.out.println(name1);
		System.out.println(name1.equals("RABIN"));
		System.out.println(name1.equalsIgnoreCase("RABIN SHRESTHA"));
		System.out.println(name1.isEmpty());
		System.out.println(!name1.isEmpty());
		System.out.println(name1.length());//number of character in string
		//in array using length
		int[] x= {1,2,3,4,5,4,3};
		System.out.println(x.length);
		
		System.out.println(name1.replace('a','o'));
		System.out.println(name1.replace('o','a'));
		System.out.println(name1.substring(2));//from began index to end of String
		System.out.println(name1.indexOf('s'));//rabin shrestha
		System.out.println(name1.indexOf('k'));//if character not available then outcome -1
		System.out.println(name1.lastIndexOf('s'));
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name1.length());
		System.out.println(name1.trim().length());//trim method only ignore front and last space not middle one
		
		
			
		
		
		
		
		
		


	}

}
