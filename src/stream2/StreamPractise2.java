package stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractise2 {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(12);
		li.add(22);
		li.add(25);
		li.add(33);
		li.add(36);
		li.add(22);
		li.add(12);
		System.out.println(li);
		//you are giving new refrence variable to i
		//toArray()---to convert stream of object into array
		Integer[] i=li.stream().toArray(Integer[]::new);//Integer[]::new----constructor refrence
		Stream.of(i).forEach(System.out::println);
		
		
//		for(int j:i) {
//			System.out.println(j);
//		}
		

	}

}
