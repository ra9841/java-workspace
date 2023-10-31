package stream;

import java.util.Arrays;
import java.util.List;

public class SortedStreamDemo2 {

	public static void main(String[] args) {
	List<String>list=Arrays.asList("Rabin","Bijeta","Bipin","Karma","Pema");//Rabin-length is 5
	list.stream()
	    .filter(n->n.length()>4)
	   // .limit(5).sorted()//ascending
	    .limit(5).sorted((t1,t2)->t2.compareTo(t1))//descending 
	    .forEach(System.out::println);

	}

}
