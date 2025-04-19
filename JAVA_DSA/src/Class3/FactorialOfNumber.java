package Class3;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = in.nextInt();
        long fact = factorialOfNum(num);  // return type of the function is stored in this long variable
        System.out.println("The Factorial of "+num+" is:"+fact);
        
    }
    public static long factorialOfNum (int num){
        if(num <2){   // this for the less then factrial of the 2 that is 1
            return 1;
        }
        int fact =1 ;
        int i=2; // here start the while loop
        while(i<=num){
            fact *=i;
            i++;  // incrementing the i bcz multification of the number every time
        }  // end of the while loop
        return fact;
    }
}
