package Class3;
import java.util.*;
public class BitwiseAnd { // this is used to the convert into the binary opertion
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First number: "); // 12
        int Num1= input.nextInt();
        System.out.print("Enter a second number: "); // 5
        int Num2 = input.nextInt();

        // to perfrom the bitwise AND opertion use single &

        int result = Num1 & Num2;
        System.out.println("The result is :"+result); // 4
        // this result is in the from of the binary operations

    }
}
