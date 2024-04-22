import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Are you a citizen of India ? (yes/no)");
        String citizen = sc.next();
        System.out.println("Do you have criminal background? (yes/no)");
        String crime = sc.next();
        if(age > 18 && citizen.equals("yes") && crime.equals("no")){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
}