package array;

import java.util.Arrays;

public class RotateArrayToRightByKSteps {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int key = 2;
		System.out.println("Original Arrya: "+Arrays.toString(arr));
		rotateArrayToRight(arr, key);
		
		System.out.println("\nArray after "+key+" "
				+ "steps rotation to the right\n"+Arrays.toString(arr));
	}

	private static void rotateArrayToRight(int[] arr, int key) {
		if (arr.length==0 || key <=0) {
			return;
		}
		
		// Adjust key if it's greater than the length of the array
        key = key % arr.length;
		
		int start = 0;
		int end = arr.length-1;
		
		//First reversing the whole array
		while (start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		//Now reverse first k steps of array
		int i =0;
		int j = key-1;
		
		while (i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		//Now reversing the remaining array
		int p=key;
		int q=arr.length-1;
		while (p<q) {
			int temp = arr[p];
			arr[p] = arr[q];
			arr[q] = temp;
			p++;
			q--;
		}
		
	}
}
