//Ticket Pricing:

//You are designing a ticket pricing program for a movie theater. The program should prompt the user for their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and movie type, the program should calculate and output the ticket price according to the following rules:
//Regular Movie:
// < 18: $8
//Age >= 18: $12
//3D Movie:
//Age < 18: $10
// >= 18: $15

//package array;
import java.util.Scanner;

public class TicketPricing {

public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

		       System.out.print("Enter your age ");
		        int age = scanner.nextInt();

		        System.out.print("Enter the type of movie regular or 3D ");
		        String movieType = scanner.next();

		  
		        double ticketPrice;
		        if (movieType.equalsIgnoreCase("regular")) {
		            if (age < 18) {
		                ticketPrice = 8.0;
		            } else {
		                ticketPrice = 12.0;
		            }
		        } else if (movieType.equalsIgnoreCase("3D")) {
		            if (age < 18) {
		                ticketPrice = 10.0;
		            } else {
		                ticketPrice = 15.0;
		            }
		        } else {
		            System.out.println("Invalid movie type entered.");
		            return;
		        }

		     
		        System.out.println("Ticket price $" + ticketPrice);

		      
		    }
		

	}
