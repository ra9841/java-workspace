package mapDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//come in sorted form in console
public class EmployeeTreeMap {

	public static void main(String[] args) {
		Map<Integer,String>m=new TreeMap<>();
		                   m.put(25,"Raju");
		                   m.put(30, null);                        //null is allowed only in value
		                   m.put(5,"Anil");
		                   m.put(15,"Geeta");
		                   m.put(18,"Karma");
		                   m.put(20,"Bipin");
		                   m.put(17, null);
		                   m.put(22,"Bipin");                     
	
		
        System.out.println(m);
        
        //Iterating the data
        Set<Map.Entry<Integer,String>>s=m.entrySet();
        for(Map.Entry<Integer,String>t:s) {
        	System.out.println(t);
        }
	}

}
