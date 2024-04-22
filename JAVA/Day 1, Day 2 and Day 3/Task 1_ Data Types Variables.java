//Task 1: Data Types/Variables

//Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.

public class SwapWithoutTemp {
    
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        swapWithoutTemp(a, b);
    }
}


//Output:

//Before swapping:a=5,b=10
//After swapping:a=10,b=5
