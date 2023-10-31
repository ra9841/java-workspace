package functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class PredicateDemoWithList {
	
	public static void main(String[]args) {
    //List is super interface
	List<String> list=new ArrayList<>();
	list.add("Apple");
	list.add("Mango");
	list.add("Guava");
	list.add("Grapes");
	list.add("Mango");
	list.add("Mango");
	System.out.println(list);
	
	//list.removeIf((String s)->s.equals("Mango"));
	list.removeIf(s->s.equals("Mango"));
	System.out.println(list);
	}
}
