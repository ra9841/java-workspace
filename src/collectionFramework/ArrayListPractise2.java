package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise2 {

	public static void main(String[] args) {
		Student st=new Student("rabin",32);
		Student st1=new Student("abin",33);
		Student st2=new Student("sabin",34);
		Student st3=new Student("nabin",35);
		Student st4=new Student("kabin",36);
		Student st5=new Student("sabin",34);
		Student st6=new Student("nabin",35);
		
		List<Student>li=new ArrayList<>();
		li.add(st);
		li.add(st1);
		li.add(st2);
		li.add(st3);
		li.add(st4);
		li.add(st5);
		li.add(st6);
		System.out.println(li);
		
		for(Student str:li) {
			System.out.println(str);
		}
		

	}

}
