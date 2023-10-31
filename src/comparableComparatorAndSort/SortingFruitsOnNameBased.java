package comparableComparatorAndSort;

import java.util.Comparator;

public class SortingFruitsOnNameBased  implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		//int x=(o1.name).compareTo(o2.name);  //ascending order
		//descending order
		int x=(o2.name).compareTo(o1.name);
		return x;
	}

}
