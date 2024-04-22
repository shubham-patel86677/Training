//Task 2: Operators
//Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division..

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		System.out.print("Type of operation : \n"+
						"1. Addition  \n"+
				        "2. Subtration \n" +
						"3. Division \n" +
				        "4. Multiplication \n");
		int res= sc.nextInt();
		switch(res) {
		case 1: int add = a+b;
			System.out.println(add);
			break;
		case 2: int sub = a-b;
			System.out.println(sub);
			break;
		case 3: int div = a/b;
			System.out.println(div);
			break;
		case 4: int mul = a*b;
			System.out.println(mul);
			break;
		default :
			System.out.println("No operation is performed");
		}


	}

}
