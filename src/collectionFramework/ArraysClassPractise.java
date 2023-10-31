package collectionFramework;

import java.util.Arrays;

public class ArraysClassPractise {//duplicate is allow in array

	public static void main(String[] args) {//on basis of array not arraylist
		int []numbers= {1,2,3,6,7,4,6,8,9,11,10,22,30,25,26};
		int index=Arrays.binarySearch(numbers,3);
		
		System.out.println("The index of element 4 in the array is "+index );
		
		Arrays.sort(numbers);
		
		//Arrays.fill(numbers,5);
		
		for(Integer in:numbers) {
			System.out.println(in);
		}

		

		

	}

}
