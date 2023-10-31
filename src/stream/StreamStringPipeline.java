package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringPipeline {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guva");
		list.add("Grapes");
		System.out.println(list);
		//Intermediate operation-it convert one stream type into another stream type
		Stream<String>st=list.stream();
			st=st.map(t->t.toUpperCase());//t->t String
			st=st.filter(t->t.startsWith("G"));
	    	st.forEach(System.out::println);//terminal operation-it will produce final output from stream.always use this in last
	    	
	    list.stream()
	         .map(s->"Mr."+s)
	         .forEach(System.out::println);
	    
	    list.stream()
	        .map(s-> s.toLowerCase())
	        .forEach(s->System.out.println(s));
	    System.out.println("_------------------------------------------------");
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name of fruit");
	    String fruit=sc.next();
	    sc.close();
	    //map is function of functional interface
	    //filter is predicate of functional interface(boolean)
	  Optional<String>opp=list.stream().map(s->s).filter(t->t.equals(fruit)).findFirst();
	  if(opp.isPresent()) {
		System.out.println(opp.get());
	  }else {
		  System.out.println("not present");
	  }
	        

	}

}
