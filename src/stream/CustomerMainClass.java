package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerMainClass {

	public static void main(String[] args) {
		Stream<Customer>customer=Stream.of(new Customer("rahul","rahul@gmail.com",38),
		     new Customer("rabin","babin@gmail.com",31),
		     new Customer("prabin","jrabin@gmail.com",34),
		     new Customer("sabin","habin@gmail.com",21),
		     new Customer("nabin","nabin@gmail.com",33),
		     new Customer("kabin","labin@gmail.com",22));
		     
		/*
		 * Map<Integer,List<Customer>>customerGroup=cust.collect(Collectors.groupingBy(c
		 * ->c.getAge()));//c->c Customer customerGroup.forEach((age,tcustomers)->{
		 * System.out.println("Age- " + age); tcustomers.forEach(System.out::println);
		 * });
		 */
		
		     //for sorting in stream
	  //customer.sorted(Comparator.comparing(Customer::getName).reversed()).forEach(System.out::println);//descending
		//customer.sorted(Comparator.comparing(Customer::getName)).forEach(System.out::println);//ascending
		//customer.sorted(Comparator.comparing(c->c.getName())).forEach(System.out::println);//other way//comparing/sorting by the name
		customer.sorted(Comparator.comparing(c->c.getEmail())).forEach(System.out::println);//comparing/sorting by the email
		    
	}




	}


