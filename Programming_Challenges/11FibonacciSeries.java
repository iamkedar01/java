
import java.util.Scanner;

  class FibonacciSeries {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in );
         System.out.print("Enter a number:");
         int num = in.nextInt();
         //  int Fseris = FibonacciSeries(num);
         System.out.println("The Fibonacci Series number is: ");
         FibonacciSeries(num);
     }

     // First understand the what they Asked in the questions
     // To find the solutions first know what the main requirements of the program
     // Understand the pattren


     public static void  FibonacciSeries(int num){
         if (num< 0) return ; // check the number is less then the zero then retun nothing
         System.out.print("0 ");
         if (num ==0) return ; // it will print 0 if number is equal to the 0
         System.out.print("1 ");
         int First= 0, Second=1;  // this are first two numbers
         while(First + Second <=num){  // this condition to get the until the given number
             int Third = First + Second;
             System.out.print(Third + " "); // it used to for the iteration of the number until the condition fails
             First = Second;
             Second = Third;
             // here above swaping will perform to change last two number every time
         }



     }
 }
