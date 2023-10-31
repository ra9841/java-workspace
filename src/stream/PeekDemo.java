package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekDemo {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guva");
		list.add("Grapes");
		System.out.println(list);
		
	
		list.stream()
		      .filter(e->e.length()>3)
		      .peek(e->System.out.println("Filtered value:"+ e))//peek takes value but do not return anything(debug)
		      .map(String::toUpperCase)
		      .peek(e->System.out.println("Mapped value:"+ e))//peek is consumer of functional interface
		      .collect(Collectors.toList());

	}

}
