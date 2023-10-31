package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();//key and value
		map.put(1,"rabin");
		map.put(2,"abin");
		map.put(3,"kabin");
		map.put(4,"sabin");
		map.put(1,"nabin");
		map.put(5,"sabin");
		
		System.out.println(map);//not duplicate key(if duplicate it will override) but value can be duplicate
		
		if(map.containsKey(1)) {
			map.put(1,"rabin");
		}
		System.out.println(map);
		
		for(Map.Entry<Integer,String>entry:map.entrySet()) {//for iteration
			System.out.println(entry);
			System.out.println(entry.getKey());//only iterating key
			System.out.println(entry.getValue());//only iterating value
			
		}
		for(Integer in:map.keySet()) {//only iterating key
			System.out.println(in);
		}
		
		for(String str:map.values()) {
			System.out.println(str);//only iterating value
		}
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("abin"));
		System.out.println(map.containsValue("jabin"));

	}

}
