package array;

public class ArrayPractise3 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};            //single dimensional array
		int[] b = {5,6,7,8};
		int[] c = {9,10,11,12};
		
		int[][]d= {                       //multiple dimensional array
				{1,2,3,4},      //0
				{5,6,7,8},      //1
				{9,10,11,12}    //2
				};
		System.out.println(d[1][0]);
       
		for(int i=0;i<d.length;i++) {       //row
			for(int j=0;j<d[i].length;j++) {    //column
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
				
		//enhanced for loop	
		}
		for(int e[]:d) {
			for(int f:e) {
				System.out.print(" "+ f);
			}
			System.out.println();
		}
	}


}
