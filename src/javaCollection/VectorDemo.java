package javaCollection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<String>list=new Vector<>();
		            list.add("Hari");
		            list.add("Ramesh");
		            list.add("Rohan");
		            list.add("Suresh");
		System.out.println(list); 
		for(String name:list) {                           //iterating list
			System.out.println(name);
		}
		
		List<Integer>list1=new Vector<>();
		             list1.add(23);
		             list1.add(25);
		             list1.add(31);
		             list1.add(35);
		 System.out.println(list1); 
		 Iterator<Integer>it=list1.iterator();              //iterating list
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		             

	}

}
