package array;

import java.util.PriorityQueue;
import java.util.HashSet;

public class FindKthMaxElementInArray {

    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 9, 9, 1, 10};
        int key = 3;
        
        int kthMax = getKthMaxElement(arr, key);
        System.out.println(key + "th Max Element in Array is: " + kthMax);
    }

    private static int getKthMaxElement(int[] arr, int key) {
        if (arr.length == 0 || arr.length < key) {
            return -1;
        }
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            q.add(num);
            if (q.size() > key) {
                q.poll();
            }
        }
        
        return q.peek();
    }
}

