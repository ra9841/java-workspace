package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassPractise {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(33);
		li.add(44);
		li.add(12);
		li.add(5);
		li.add(10);
		li.add(44);
		li.add(44);
		System.out.println(li);
	
		System.out.println(Collections.min(li));
		System.out.println(Collections.max(li));
		System.out.println(Collections.frequency(li, 44));
		
		Collections.sort(li);//for sorting
		System.out.println(li);
		
		Collections.sort(li,Comparator.reverseOrder());//for reverse sorting
		System.out.println(li);
		
		

	}

}
