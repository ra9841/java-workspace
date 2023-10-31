package comparableComparatorAndSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitMainClass {

	public static void main(String[] args) {
		Fruit fr=new Fruit(20,"Mango","Yellow");
		Fruit fr1=new Fruit(10,"Banana","Yellow");
		Fruit fr2=new Fruit(40,"Apple","Red");
		Fruit fr3=new Fruit(20,"Mango","Yellow");
		
		List<Fruit> list=new ArrayList<Fruit>();
					list.add(fr);
					list.add(fr1);
					list.add(fr2);
					list.add(fr3);
					
					System.out.println(list);
					
					System.out.println("-------sort the elements ------");
					Collections.sort(list);
					
					System.out.println(list);
					System.out.println("-------sort the elements on the basis of name ------");
					Collections.sort(list,new SortingFruitsOnNameBased());
					System.out.println(list);
					System.out.println("-------sort the elements on the basis of color ------");
					Collections.sort(list,new SortingFruitOnColorBased() );
					System.out.println(list);
	}

}
