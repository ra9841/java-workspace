package stream2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractise {

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
	
	List<Integer>lis=li.stream().filter(t ->t%2==0).collect(Collectors.toList());
	System.out.println(lis);//if you want to get object then go for stream
	
	List<Integer>lis1=li.stream().map(t ->t+5).collect(Collectors.toList());
	System.out.println(lis1);//for every object if you want something to generate from that then go for map
	
	List<Integer>lis2=li.stream().filter(t -> t>25).collect(Collectors.toList());
	System.out.println(lis2);
	
	List<Integer>lis3=li.stream().sorted().collect(Collectors.toList());
	System.out.println(lis3);
	
	List<Integer>lis4=li.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
	System.out.println(lis4);//ascending
	
	List<Integer>lis5=li.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
	System.out.println(lis5);//dscending
	
	int i=li.stream().min((l1,l2)->l1.compareTo(l2)).get();
	System.out.println(i);//min value //first value
	
	int j=li.stream().max((l1,l2)->l1.compareTo(l2)).get();
	System.out.println(j);//max value //last value
	
	li.stream().forEach(System.out::println);
	
	
	


	}

}
