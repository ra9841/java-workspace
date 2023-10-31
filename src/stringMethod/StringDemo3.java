package stringMethod;

public class StringDemo3 {

	public static void main(String[] args) {
		String name = "Rabin";
		String[] text = name.split("");

		for (String str : text) {
			System.out.println(str);
		}
		System.out.println("..............................");
		String str="hari";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("..............................");
		String str1="keshav";
		System.out.println(str1.length());//6
		for(int j=str1.length()-1;j>=0;j--) {
			System.out.println(str1.charAt(j));
			
		}
		
		System.out.println("..............................");
		 String str2 = "hemant";
	        StringBuilder reversedStr = new StringBuilder(str2).reverse();
	        System.out.println(reversedStr);
		

	}

}
