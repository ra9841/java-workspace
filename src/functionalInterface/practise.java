package functionalInterface;

public class practise {
	
	//lamda expression represents an instance of annonymous class based on functional interface

	@FunctionalInterface
	public interface Supplier<T> {
		T get();
	}
	//types of functional interface    method name
	//consumer- accept       -can take one output & not produce anything
	//supplier-get           -will not take any input & only produce output
	//predicate-test         -produce boolean value
	//function-apply         -rake one input & produce one output

}
