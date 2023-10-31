package array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] num= new int[4];
		num[0]=2;
		num[1]=3;
		num[2]=4;
		num[3]=5;
		int mult =1;
		for(int i=0;i<num.length;i++) {
			mult=mult*num[i];
			
		}
		System.out.println(mult);
		
		

	}

}


