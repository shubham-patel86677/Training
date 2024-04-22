import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product price");
        int price = sc.nextInt();
        System.out.println("Are you a premium member ? (yes/no)");
        String member = sc.next();
        if(price > 100){
            if(member.equals("yes")){
                price -= (price * 20)/100;
            }
            else{
                price -= (price * 10)/100;
            }
        }

        System.out.println(price);

    }
}