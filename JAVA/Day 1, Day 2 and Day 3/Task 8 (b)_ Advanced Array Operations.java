//Task 8 - Advanced Array Operations

//(b): Create a recursive function to find the nth element of a Fibonacci sequence and store the first n elements in an array.


public class Fibonacci {

    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    
    public static int[] fibonacciArray(int n) {
        int[] fibArray = new int[n];
        for (int i = 0; i < n; i++) {
            fibArray[i] = fibonacci(i);
        }
        return fibArray;
    }

    public static void main(String[] args) {
        int n = 8; // Number of Fibonacci numbers to generate
        int[] fibArray = fibonacciArray(n);

        
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibArray[i] + " ");
        }
    }
}
