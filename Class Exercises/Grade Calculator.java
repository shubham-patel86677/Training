//Grade Calculator:

//You are tasked with creating a grade calculator program. The program should take a student's score as input and output their corresponding grade based on the following criteria:
//: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: Below 60
//Ensure that if the input score is not within the range of 0 to 100, the program outputs an error message.
//package array;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	       System.out.println("Enter student marks");
		   int marks=s.nextInt();
		   if(marks>=90&&marks<=100)
			{
			   System.out.println("A grade");
			}
			else if(marks>=80&&marks<=89)
			{
			   System.out.println("B grade");
			}
			else if(marks>=70&&marks<=79)
			{
			   System.out.println("C grade");
			}
			else if(marks>=60&&marks<=69)
			{
			   System.out.println("D grade");
			}
			else if(marks<60)
			{
				System.out.println("failed");
			}
			else
			{
				System.out.println("Error ");
			}
		}
	

	}
