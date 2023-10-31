package collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractise {//gives prority

	public static void main(String[] args) {

		//PriorityQueue<Integer> queue = new PriorityQueue<>();
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());//in reverse
		queue.offer(42);
		queue.offer(22);
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
