package Class4;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 =in.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = in.nextInt();
        int lcm =LcmOfNum(num1 ,num2);
        System.out.println("the LCM of the "+num1+ " and "+num2+ " is: "+lcm);
    }
    public static int LcmOfNum(int num1 , int num2){
       int i =1;
       while(i<=num2){
           int mul = num1 *i;
           if(mul % num2 ==0){
               return mul;
           }
           i++;
       }
        return 0;
    }
}
