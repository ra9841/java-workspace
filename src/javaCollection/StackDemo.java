package javaCollection;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	     List<Character>list=new Stack<>();
	                    list.add('h');
	                    list.add('o');
	                    list.add('m');
	                    list.add('e');
	      System.out.println(list); 
	      for(Character temp:list) {
	    	  System.out.println(temp);
	      }
	      
	      List<Float>list1=new Stack<>();
	                 list1.add(1.9f);
	                 list1.add(2.3f);
	                 list1.add(3.33f);
	                 list1.add(0.25f);
	        System.out.println(list1);
	        for(Float temp1:list1) {
	        	System.out.println(temp1);
	        }
	                 
	                 
	}

}
