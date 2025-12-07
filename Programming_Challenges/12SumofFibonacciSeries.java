
import java.util.*;
 class SumofFibonacciSeries{
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = in.nextInt();
         System.out.println(calculateSum(num));
     }
 public static int calculateSum(int num) {
     int a = 0, b = 0, sumf = 1;

     // Edge Case When n is 0
     if (num <= 0)
         return 0;

     int curr = 1;
     for (int i = 2; i <= num; i++) {
         // update a,b and curr
         a = b;
         b = curr;
         curr = a + b;
         sumf += curr;
     }
     return sumf;
 }
}