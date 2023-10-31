package setDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetAndTreeset {

	public static void main(String[] args) {
		Set<Character>se=new HashSet<>();
		              se.add('R');
		              se.add('A');
		              se.add('B');
		              se.add('I');
		              se.add('N');
		System.out.println(se);         
		
		Set<Integer> se1=new HashSet<>();
		             se1.add(42);
		             se1.add(53);
		             se1.add(25);
		             se1.add(10);
		             se1.add(52);
		System.out.println(se1);    
		
		Set<Character>se2=new TreeSet<>();
		              se2.add('R');
                      se2.add('A');
                      se2.add('B');
                      se2.add('I');
                      se2.add('N');
         System.out.println(se2);         

        Set<Integer> se3=new TreeSet<>();
                      se3.add(42);
                      se3.add(53);
                      se3.add(25);
                      se3.add(10);
                      se3.add(52);
          System.out.println(se3);    

		             

	}

}
