package stringMethod;
public class StringDemo2 {

	public static void main(String[] args) {
	String name="Java is a programming language";
	
	//upper case
	String upper=name.toUpperCase();
	System.out.println(upper);
	
	//lower case
	System.out.println(name.toLowerCase());
	
	//replace
	System.out.println(name.replace("is","are"));
	
	//substring
	System.out.println(name.substring(0,21));
	
	//startwith
	System.out.println(name.startsWith("Java"));
	
	//concat
	String str="Rabin";
	String str1="Rahul";
	String str2="Rohan";
	String str3=str.concat(str1).concat(str2);
	System.out.println(str3);
	
	//split
	String[] result=name.split(" ");
	for(String t:result) {
		System.out.println(t+" ");
	}
	
	//charAt
	for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		System.out.println("i="+ch);
	}
	//repeat
	System.out.println(name.repeat(4));
	
	//endswith
	System.out.println(name.endsWith("language"));
	
		}

}
