package array;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 9, 1, 10};
        
        sortArrayByBubbleSortTechnique(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArrayByBubbleSortTechnique(int[] arr) {
        int n = arr.length;
        
        // Loop to control total number of passes
        for (int i = 0; i < n - 1; i++) {
        	// Optimization flag to check if any swapping happened
        	boolean swapped = false; 
            
            // Loop for handling the logic of sorting
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

