package collectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractise {//sort onthe bais of key

	public static void main(String[] args) {
		Map<Integer,String>map=new TreeMap<>();//key and value.no duplicate key is allowed but allow in value
		map.put(1,"rabin");
		map.put(5,"sabin");
		map.put(2,"abin");
		map.put(8,"jabin");
		map.put(3,"kabin");
		map.put(4,"sabin");
		map.put(1,"nabin");
		
		
		System.out.println(map);
		System.out.println(map.remove(8));
		System.out.println(map);

	}

}
