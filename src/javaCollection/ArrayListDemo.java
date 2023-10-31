package javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String>li=new ArrayList<>();
		            li.add("Rabin");
		            li.add("Ramesh");
		            li.add("Sita");
		            li.add("Gita");
		            System.out.println(li);         
		for(String name:li) {                      //iterating list
		System.out.println(name);                
		}                                            //converting araylist to array
		
		List<Integer>ll=new ArrayList<>();
		             ll.add(31);
		             ll.add(30);
		             ll.add(25);
		             ll.add(35);
		             System.out.println(ll);
		 for(Integer age:ll) {                      ////iterating list
			 System.out.println(age);
		 }
		 //sort the list of elements(ascending order)
		 Collections.sort(li);
		 System.out.println(li);
		 Collections.sort(ll);
		 System.out.println(ll);
		 
		 //search operation 
		 System.out.println(li.contains("Ramesh"));       //true
		 System.out.println(li.contains("Bijeta"));       //false
	}

}
