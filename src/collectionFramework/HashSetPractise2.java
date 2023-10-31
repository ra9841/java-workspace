package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractise2 {

	public static void main(String[] args) {
		Student student=new Student("rabin",32);
		Student student1=new Student("abin",30);
		Student student2=new Student("kabin",22);
		Student student3=new Student("nabin",52);
		Student student4=new Student("kabin",22);
		Student student5=new Student("nabin",33);
		
		Set<Student> std=new HashSet<>();
		std.add(student);
		std.add(student1);
		std.add(student2);
		std.add(student3);
		std.add(student4);
		std.add(student5);
		
		System.out.println(std);
		//if we make hash code in Student pojo class then it will  abolish duplicate but should have equal parameter..eg.kabin
		//if parameter value is different then do not abolish duplicate

	}

}
