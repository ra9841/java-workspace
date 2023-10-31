package stringMethod;

import java.util.Scanner;

public class StringImportantForDevloperExamplePractise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of city");
		String str=sc.nextLine().toLowerCase().trim();//whatever the case it will convert to lower case
		                                              //trim--it will ignore space
		sc.close();
		if(str.equals("berkley")) {
			System.out.println("this is my city");
		}else if(str.equals("richmond")) {
			System.out.println("not my city");
		}else if(str.equals("oakland")) {
			System.out.println("i live before");
		}else {
			System.out.println("enter correct city name");
		}
		
		//both scp and heap memeory if existing object is there then use same one if not then create new object
		String s1= new String("rabin");//heap-rabin  scp-rabin
		String s2=s1.toLowerCase();//heap-rabin---use same rabin of heap memory
		String s3=s1.toUpperCase();//heap-RABIN
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		
		String st1= "rabin";//scp-rabin
		String st=st1.toString();//scp-rabin--use same
		String st2=s1.toLowerCase();//scp-rabin--use same
		String st3=s1.toUpperCase();//heap-RABIN---new object is created because run time operation
		System.out.println(st1==st);//true
		System.out.println(st1==st2);//false
		System.out.println(st1==st3);//false
		//once String object is created its content cannot be changed.if its changed then it will create new object.
		//if having same content then reusalility is occured

	}

}
