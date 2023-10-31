package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractise {//no duplicate allow,come in sorted form

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(12);
		set.add(23);
		set.add(43);
		set.add(55);
		set.add(5);
		set.add(12);
		
		System.out.println(set);
		System.out.println(set.remove(55));
		System.out.println(set);
		System.out.println(set.contains(12));//boolean value
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
	
		Set<Integer>set1=new LinkedHashSet<>();//not in sorted form
		set1.add(12);
		set1.add(23);
		set1.add(43);
		set1.add(55);
		set1.add(5);
		set1.add(12);
		System.out.println(set1);
		
		
		Set<Integer>set2=new TreeSet<>();// in sorted form
		set2.add(12);
		set2.add(23);
		set2.add(43);
		set2.add(55);
		set2.add(5);
		set2.add(12);
		System.out.println(set2);

	}

}
