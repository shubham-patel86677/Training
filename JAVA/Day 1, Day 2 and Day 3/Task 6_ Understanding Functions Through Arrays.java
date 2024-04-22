//Task 6: Understanding Functions through Arrays

//a) Write a recursive function named SumArray that calculates and returns the sum of elements in an array, demonstarte with example.

  
public class SumArray {
   
      public static int sumArray(int[] arr, int index) {
        
        if (index == arr.length) {
            return 0;
        }
        
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int sum = sumArray(array, 0);
        System.out.println("Sum of elements in the array: " + sum); 
    }
}

