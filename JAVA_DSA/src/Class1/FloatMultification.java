package Class1;
import java.util.*;
public class FloatMultification {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a First float number:");
        double a  = in.nextDouble();
        System.out.print("Enter a second number:");
        double b = in.nextDouble();

        double c = a * b;
        System.out.println("The Product of two number is :" + c);

    }
}
