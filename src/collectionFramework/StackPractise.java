package collectionFramework;

import java.util.Stack;

public class StackPractise {//first come first out
	
	public static void main(String[] args) {
		Stack<String>animal=new Stack<>();
		animal.push("lion");
		animal.push("dog");
		animal.push("horse");
		animal.push("goat");
		animal.push("cat");
		System.out.println(animal);
		
		System.out.println(animal.peek());//which is at top/first
		System.out.println(animal.pop());//out
		System.out.println(animal.peek());
		System.out.println(animal);
	}
	

}
