package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) throws Exception {
		int[] arr = {1, 2, 3, 4};
		
		int[] effecientSolution = getProductOfArrayEfficiently(arr);
		
		System.out.println("Array after product: "+Arrays.toString(effecientSolution));
		
	}
	
	
	//Solution with time complexity O(n)
	private static int[] getProductOfArrayEfficiently(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Empty Array!");
        }                   	

        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Fill the result array with left products
        result[0] = 1; // There is no element to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Multiply with the right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

}
