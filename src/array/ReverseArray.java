package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		reverseArray(arr);
		System.out.println("Reversed Array is: "+Arrays.toString(arr));
	}
	
	/*
	 * Time complexity in this method is O(n) or length of array
	 * Space complexity is O(1), as no extra space is used
	 */

	private static int[] reverseArray(int[] arr) {
		if (arr.length==0) {
			return arr;
		}
		
		int start =0;
		int end = arr.length-1;
		
		while (start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
}
