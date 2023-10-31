package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOperation {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

		//allows you to sort the elements of a stream in a certain order and 
		//produce a new stream consisting of the sorted elements
		List<String> sortedNames = names.stream()
		                                  .sorted()
		                                  .collect(Collectors.toList());
		System.out.println(sortedNames);
		
		//to reverse sort
		List<String> reverseSortedNames1 = names.stream()
                                           .sorted(Comparator.reverseOrder())
                                            .collect(Collectors.toList());
		System.out.println(reverseSortedNames1);
				
		                                		  

	}

}
