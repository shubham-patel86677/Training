import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        int count = 1;
        while(flag){
            System.out.println("Enter your guess from 1 to 100");
            int num = sc.nextInt();

                if(num == randomInt){
                    System.out.println("Correct");
                    System.out.println("You got answer in "+ count+" attempt");
                    flag = false;
                }
                else if(num > randomInt){
                    System.out.println("Higher");
                }
                else{
                    System.out.println("Lower");
                }
                count++;
        }
    }
}