package array;

import java.util.Arrays;

public class ShiftZerosToRight {

	public static void main(String[] args) {
		 int[] arr = {5, 0, 4, 0, 9, 0, 1, 10};
		 
		 shiftZerosToTheRight(arr);
		 
		 System.out.println("Array after zeroes shift: "+Arrays.toString(arr));
	}

	private static void shiftZerosToTheRight(int[] arr) {
		if (arr.length==0) {
			return;
		}
		int start = 0;
		
		for (int i=0; i< arr.length; i++) {
			if (arr[i] !=0) {				
				arr[start++] = arr[i];
			}
		}
		
		for (int i = start; i < arr.length; i++) {
			arr[i] = 0;
		}
		
	}
}
