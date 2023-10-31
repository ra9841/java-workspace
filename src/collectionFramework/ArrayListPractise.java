package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {
	
	public static void main(String[] args) {
		List<String>li=new ArrayList<>();
		li.add("rabin");
		li.add("rohan");
		li.add("sita");
		li.add("himal");
		System.out.println(li);
		li.add(2,"anil");
		System.out.println(li);
		
		List<String>li1=new ArrayList<>();
		li1.add("keshav");
		li1.add("suman");
		System.out.println(li1);
		
		li.addAll(li1);//adding all list
		System.out.println(li);
		
		System.out.println(li.get(3));
		System.out.println(li.get(0));
		System.out.println(li.remove(4));
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.equals(li1));
		System.out.println(!li.equals(li1));
		System.out.println(li.set(3, "bijeta"));
		System.out.println(li);
		System.out.println(li.contains("rabin"));
		
		for(String str:li) {//iterate
			System.out.println("name:" + str);
		}

	}

}
