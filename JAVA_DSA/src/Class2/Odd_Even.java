package Class2;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = in.nextInt();

        // The logic is the number is divide by 2 reminder is zero the num is odd otherwise its even
        if (num % 2 == 0){
            System.out.println("The number is Even");
        }
        else
            System.out.println("The number is Odd");
    }
}
