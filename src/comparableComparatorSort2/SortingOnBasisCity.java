package comparableComparatorSort2;

import java.util.Comparator;

public class SortingOnBasisCity implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int x=(o1.city).compareTo(o2.city);
		//int x=(o2.city).compareTo(o1.city);
		return x;
	}

}
