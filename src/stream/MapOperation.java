package stream;

import java.util.Arrays;
import java.util.List;

public class MapOperation {
//stream.map()-takes function of functional interface
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		//allows you to apply a function to each element of a stream and 
		//produce a new stream consisting of the results.
/*
		List<Integer> squaredNumbers = numbers.stream()
		                                      .map(n -> n * n)
		                                      .collect(Collectors.toList());
		System.out.println(squaredNumbers);*/
		
		//numbers.stream().map(n -> n * n).forEach(System.out::println);
		numbers.stream().map(n -> n * n).forEach(y-> System.out.println(y));
		
		

	}

}
