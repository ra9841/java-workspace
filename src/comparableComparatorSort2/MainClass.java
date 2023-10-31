package comparableComparatorSort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Employee em=new Employee("Ram","HR","Albany");
		Employee em1=new Employee("Hari","Finance","Elcerrito");
		Employee em2=new Employee("Shyam","Accountant","Sanpablo");
		Employee em3=new Employee("Rabin","Management","Berkeley");
		
		List<Employee>li=new ArrayList<>();
		              li.add(em);
		              li.add(em1);
		              li.add(em2);
		              li.add(em3);
		              System.out.println(li);
		  //sorting on the basis of name            
		  Collections.sort(li); 
		  System.out.println(li);
		  //sorting on the basis of department
		  Collections.sort(li,new SortingOnBasisDepartment());
		  System.out.println(li);
		  //sorting on the basis of city
		  Collections.sort(li,new SortingOnBasisCity());
		  System.out.println(li);
		  
		              
		

	}

}
