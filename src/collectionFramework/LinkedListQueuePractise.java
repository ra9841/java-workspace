package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueuePractise {//last in first out

	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();
		queue.offer(42);
		queue.offer(22);
		queue.offer(12);
		queue.offer(33);
		queue.offer(44);
		queue.offer(12);
		System.out.println(queue);
		System.out.println(queue.poll());//out
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		

	}

}
