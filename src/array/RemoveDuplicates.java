package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 4, 4, 9, 9, 1, 10};
        
        int[] resultArray = removeDuplicatesFromArray(arr);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] removeDuplicatesFromArray(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i : arr) {
            set.add(i);
        }
        return set.stream().mapToInt(i -> i).toArray();
    }
}
