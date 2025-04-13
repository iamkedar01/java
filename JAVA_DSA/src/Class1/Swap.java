package Class1;

import java.util.*;
public class Swap {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a First number: ");
        int a = in.nextInt();
        System.out.print("Enter a second number: ");
        int b = in.nextInt();

        int temp = a;
        a =b;
        b=temp;
        System.out.println();
        System.out.println("After swaping the number"); // or \n font and last in the sentence \n
        System.out.println();
        System.out.println("The value of first number is: " + a);
        System.out.print("The value of second number is: " +b);



    }
}
