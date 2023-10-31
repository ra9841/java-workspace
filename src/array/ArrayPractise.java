package array;

public class ArrayPractise {

	public static void main(String[] args) {
       int[]num = new int[4];
		num[0]=2;
		num[1]=3;
		num[2]=4;
		num[3]=5;
		int mult =1;
		System.out.println("The multiple number is");
		for(int i=0;i<num.length;i++) {
			mult=mult*num[i];
			
		}
		System.out.println(mult);
		

		
		//Different method using array
		int[]num1 = {2,3,4,5};
		int multi =1;
		for(int i=0;i<num1.length;i++) {
			multi=multi*num1[i];
			
		}
		System.out.println(multi);
		
		System.out.println("The addition number is");
		
		int[] num3= new int[5];
		num3[0]=5;
		num3[1]=6;
		num3[2]=5;
		num3[3]=7;
		num3[4]=5;
		int sum=0;   
		for(int i=0;i<=num.length;i++) {
			sum=sum + num3[i];
			
		}
		System.out.println(sum);
		

	}

}


