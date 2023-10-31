package stringPattern;

import java.util.regex.Pattern;

public class StringJava {
	
	  
	       
	   

	public static void main(String[] args) {
	     String name="rabin"; //store in internal memory//both use same memory(name and name1)
	     String name1="rabin";
	     String name2="kabin";
	     String name3=new String("rabin");//store in heap memory and also has space in instance momory
	     String name4=new String("rabin");
	     String name5=new String("kabin");
	     
	     //string is immutable:once it is created its value cannot be modified
	     String s1="hello";
	     String s2=s1;
	     s1=s1+"world";  //concatenate the string
	     System.out.println(s1);
	     System.out.println(s2);//leaving orginal object unchanged
	     
	     
	     System.out.println(name==name1);//true
	     System.out.println(name==name2);//false
	     System.out.println(name3==name4);//false
	     System.out.println(name4==name5);//false
	     System.out.println(name==name3);//false
	     System.out.println((name).equals(name1));//true
	     System.out.println((name).equals(name2));//false
	     System.out.println((name3).equals(name4));//true  //due to same content
	     System.out.println(name.hashCode());//108268664
	     System.out.println(name1.hashCode());//108268664
	     System.out.println(name2.hashCode());//101804017
	     System.out.println(name3.hashCode());//108268664
	     System.out.println(name4.hashCode());//108268664
	     System.out.println(name5.hashCode());//101804017
	     
	     
	     
	    
	    
	 


	}



	}


