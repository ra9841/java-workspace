package stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractise1 {
	public static void main(String[] args) {
		List<String>li=new ArrayList<>();
		li.add("rabin");
		li.add("amanaaa");
		li.add("rajexh");
		li.add("bijeta");
		li.add("hariaaa");
		li.add("sonamaaa");
		li.add("pranaya");
		System.out.println(li);
		
		Comparator<String>c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		
		List<String>st=li.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(st);//ascending
		
		List<String>st1=li.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(st1);//descending
		
		List<String>st3=li.stream().sorted(c).collect(Collectors.toList());
		System.out.println(st3);
		
		li.stream().sorted(c).collect(Collectors.toList()).forEach(System.out::println);//for iterator
	}

}
