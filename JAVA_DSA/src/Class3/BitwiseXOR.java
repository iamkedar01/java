package Class3;
import java.util.*;
public class BitwiseXOR {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("enter a first number:"); // 10
        int num1 = in.nextInt();
        System.out.print("Enter a second number:"); // 4
        int num2 =in.nextInt();

        int result = num1 ^num2;
        System.out.println("the result is:" +result); // 4
    }
}
