package comparableComparatorAndSort;

import java.util.Comparator;

public class SortingFruitOnColorBased implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
	//int y=(o1.color).compareTo(o2.color);               //sorting on ascending order
	int y=(o2.color).compareTo(o1.color);                 //sorting on dscending order
		return y;
	}

}
