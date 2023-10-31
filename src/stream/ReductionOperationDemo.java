package stream;

import java.util.ArrayList;
import java.util.List;

//Reduction operation is like terminal operation but all Terminal operation is not reduction opeation
public class ReductionOperationDemo {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guva");
		list.add("Grapes");
		System.out.println(list);
		
		long cou=list.stream().count();
		System.out.println(cou);

	}

	

}
