//Task 4: Arrays - Declaration, Initialization, and Usage

//Create a program that declares an array of integers, initializes it with consecutive numbers, and prints the array in reverse order.


public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {15,25,35,45,55,65};
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]+" ");
	}
	

}

//Output: 65 55 45 35 25 15
