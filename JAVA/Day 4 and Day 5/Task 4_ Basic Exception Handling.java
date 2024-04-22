//Task 4: Basic Exception Handling

//Write a program that attempts to divide by zero, catches the ArithmeticException, and provides a custom error message.

public class DivideByZeroExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}