package array;

import java.util.Arrays;

public class RotateArrayLeft {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int k=2;
		
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		rotateArrayLeftByKSteps(arr, k);
		
		System.out.println("Array after k rotation to left: \n"+Arrays.toString(arr));
	}

	private static void rotateArrayLeftByKSteps(int[] arr, int k) {
		if (arr.length==0 || k<=0) {
			return;
		}
		
		/*If k is greater than arrays length, then we adjust k
		 * to avoid extra rotation 
		*/
		k = k%arr.length;
		
		//first reverse k elements of array
		int i=0;
		int j=k-1;
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		//now reverse the remaining array
		int p = k;
		int q = arr.length-1;
		while (p<q) {
			int temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
			p++;
			q--;
		}
		
		
		//now reverse the complete array 
		int start=0;
		int end = arr.length-1;
		while (start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
}
