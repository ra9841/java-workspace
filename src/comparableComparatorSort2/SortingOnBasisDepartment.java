package comparableComparatorSort2;

import java.util.Comparator;

public class SortingOnBasisDepartment implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	int x=(o1.department).compareTo(o2.department);
	//int x=(o2.department).compareTo(o1.department);
		return x;
	}

}
