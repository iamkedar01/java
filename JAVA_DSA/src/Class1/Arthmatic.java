package Class1;
import java.util.*;
public class Arthmatic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = in.nextInt();
        System.out.print("Enter a second  number: ");
        int b = in.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println("The Addition of two number is:" + add);
        System.out.println("The substraction of two number is:" + sub);
        System.out.println("The Multipication of two number is:"+ mul);
        System.out.println("The Division of two number is:"+div);
        System.out.println("The reminder of the two number is"+rem);


    }
}
