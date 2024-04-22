 //Task7 - Array Sorting and Searching.

//(b): Write a function named PerformLinearSearch that searches for a specific element in an array and returns the index of the element if found or -1 if not found.

public class LinearSearch {
    
    public static int performLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {6, 4, 10, 3, 8, 7};
        int elementToFind = 10;
        int index = performLinearSearch(array, elementToFind);
        if (index != -1) {
            System.out.println("The element " + elementToFind + " is found at index " + index + ".");
        } else {
            System.out.println("The element " + elementToFind + " is not found in the array.");
        }
    }
}
