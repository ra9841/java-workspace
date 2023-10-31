package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Character>lis=new LinkedList<>();
		               lis.add('R');
		               lis.add('A');
		               lis.add('B');
		               lis.add('i');
		               lis.add('N');
		  System.out.println(lis); 
		  Iterator<Character>it=lis.iterator();                  //iterating list
		  while(it.hasNext()) {
		  System.out.println(it.next());
		  }
		  
		  List<Double>lis1=new LinkedList<>();
		              lis1.add(28.88);
		              lis1.add(12.44);
		              lis1.add(44.2256);
		              lis1.add(23.33);
		  System.out.println(lis1);  
		  Iterator<Double>itr=lis1.iterator();                   //iterating list
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}

}
