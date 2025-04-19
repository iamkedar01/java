package Class4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        boolean prime = isprime(num); // takeing boolean value

        if(prime){ // based on the boolean value printing the prime or not
            System.out.println("The number "+ num+" is a prime number");
        }else{
            System.out.println("The number "+num+" not a prime number");
        }
    }

    public static boolean isprime(int num){
        int i=2;// The prime number is start from the 2
        while(i<num){ // the loop run until i is less then the number
            if(num%i==0){ // then number is divide by the number is 0
                return false; // it is not a prime number
            }
            i++;
        }

        return true; // it is prime number
    }
}
