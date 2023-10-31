package collectionFramework;

import java.util.ArrayDeque;

public class ArrayDequePractise {//can put element from everywhere--fron or back

	public static void main(String[] args) {
		ArrayDeque<Integer>queue=new ArrayDeque<>();
		queue.offer(42);
		queue.offerFirst(22);
		queue.offerLast(33);
		queue.offer(44);//it will be last
		queue.offer(12);//it wil be last 
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue);
		
		System.out.println(queue.poll());//first remove
		System.out.println(queue.pollFirst());//first remove
		System.out.println(queue.pollLast());//last remove
		System.out.println(queue);
		
		System.out.println(queue.pop());//first remove
		System.out.println(queue);
		
		

	}

}
