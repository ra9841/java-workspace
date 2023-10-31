package exceptionHandling1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateException {

	public static void main(String[] args) {
	/*	Thread t=new Thread();
		t.start();
		t.start();//IllegalThreadStateException
		          //if you start first and again then we will get exception
*/
		
		List<String>str=new ArrayList<>();
		str.add("rabin");
		str.add("durga");
		str.add("hem");
		
		Iterator itr=str.iterator();
		while(itr.hasNext()) {
			
			itr.remove();//IllegalStateException//we r calling remove method in wrong time so exception we get
		}
	}

}
