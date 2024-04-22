//Task 7: Array Sorting and Searching

//a) Implement a function called BruteForceSort that sorts an array using the brute force approach. Use this function to sort an array created with InitializeArray.


import java.util.*;

public class BruteForceSort {
    public static void bruteForceSort(int[] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] initializeArray(int size, int minValue, int maxValue) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        int size = 10;
        int minValue = 0;
        int maxValue = 100;
        int[] array = initializeArray(size, minValue, maxValue);
        System.out.println("Unsorted array: " + Arrays.toString(array));
        bruteForceSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
