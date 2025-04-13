package Class1;
import java.sql.SQLOutput;
import java.util.*;
public class Sum {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a First number: ");
        int Num1 = in.nextInt();
        System.out.print("Enter a second number: ");
        int Num2 = in.nextInt();

        int sum = Num1+Num2;
        System.out.println("the sum of two number is: "+ sum);
    }
}
