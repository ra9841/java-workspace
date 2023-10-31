package array;

public class ArrayPractise2 {
	public static void main(String[] args) {
		int[] num3= new int[5];
		num3[0]=5;
		num3[1]=6;
		num3[2]=5;
		num3[3]=7;
		num3[4]=8;
		int sub=0;
		for(int i=0;i<num3.length;i++) {
			sub = sub-num3[i];
		}
		System.out.println(sub);
		//update array elements
		 num3[2]=20;
		 num3[4]=30;
	    for(int x=0;x<num3.length;x++) {
	    System.out.println(num3[x]);
	    }
		 
		

	}


}
