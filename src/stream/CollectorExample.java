package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Guva");
		list.add("Grapes");
		System.out.println(list);
		
		List<String>li=list.stream()
		    .map(t->t).map(s->s.toLowerCase()).map(p->"Mr."+p).collect(Collectors.toList());
		    li.forEach(System.out::println);

	}

}
