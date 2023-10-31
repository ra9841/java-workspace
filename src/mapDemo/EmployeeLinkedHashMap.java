package mapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//whatever insertion come same in console
public class EmployeeLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer,String>ma=new LinkedHashMap<>();
		                   ma.put(null,"Rohan");
		                   ma.put(20,"Hari");
		                   ma.put(30, null);
		                   ma.put(5, null);
		                   ma.put(6,"Raju");
		                   ma.put(18,"Rishi");
		                   ma.put(16,"Raju");
		System.out.println(ma);
		
		//iterating the data
		Set<Map.Entry<Integer,String>>set=ma.entrySet();
		for(Map.Entry<Integer,String> map:set) {
			System.out.println(map);
		}

	}

}
