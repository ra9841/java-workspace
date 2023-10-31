package stringPattern;

public class StringMethod {
	

	public static void main(String[] args) {
		String name="My name is Rabin";
		String name1="Bhakta";
		String name2="Shrestha";
		String name3 =name.concat(name1).concat(name2);
		System.out.println(name3);
		System.out.println(name3.toUpperCase());
		System.out.println(name3.toLowerCase());
		System.out.println(name3.replace("is","are"));
		System.out.println(name3.substring(0,22));
		System.out.println(name3.startsWith("my"));
		
		String[] data=name3.split("");
		for(String str:data) {
			System.out.println(str);
		}
		
		for(int i=0;i<name.length();i++) {
			char ch=name3.charAt(i);
			System.out.println(ch);
		}

	}

}
