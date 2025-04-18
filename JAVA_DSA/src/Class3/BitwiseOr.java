package Class3;
import java.util.*;
public class BitwiseOr  {
    public  static void main (String[] args){

        Scanner  in = new Scanner(System.in);
        System.out.print("enter a first number: "); //  6
        int num1= in.nextInt();
        System.out.print("enter a second number: "); //      12
        int num2 = in.nextInt();

        int result  = num1 |num2;
        System.out.println("the result of to number is:" +result);  //   14
    }
}
