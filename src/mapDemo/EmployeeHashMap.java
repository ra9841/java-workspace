package mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//for faster storing and deletion of key & value
public class EmployeeHashMap {

	public static void main(String[] args) {
		Map<Integer,String>ma=new HashMap<>();
		                   ma.put(2,"Rahul");
		                   ma.put(5,"Anil");
		                   ma.put(null,"Hari");                 //one null is allowed in key
		                   ma.put(20,null);                     //multiple null is allowed in value
		                   ma.put(10, null);
		                   ma.put(6,"Sabita");
		                   ma.put(15,"Anil");                   //duplicay is allowed in value
		System.out.println(ma);  
		//Iterating the data
		Set<Map.Entry<Integer,String>>se=ma.entrySet();
		
		for(Map.Entry<Integer,String>temp:se) {
			System.out.println(temp);
			System.out.println(temp.getKey());
			System.out.println(temp.getValue());
		}
		

	}

}
