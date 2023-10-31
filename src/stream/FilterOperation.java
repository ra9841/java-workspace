package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");
		
		//allows you to select elements from a stream based on a certain condition and
		//produce a new stream consisting of the selected elements.

		List<String> filteredNames = names.stream()
		                                   .filter(n -> n.startsWith("A") || n.startsWith("E"))
		                                   .collect(Collectors.toList());
	  System.out.println(filteredNames);

	}

}
