package Class4;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a first number: "); //15
        int num1 =in.nextInt();
        System.out.print("Enter a second number: ");// 20
        int num2 = in.nextInt();
        int gcd =GcdOfNum(num1 ,num2);
        System.out.println("the LCM of the "+num1+ " and "+num2+ " is: "+gcd); // 5
    }

    public static int GcdOfNum(int num1 , int num2) {
        int gcd = 1; // this normal gcd
        int i = 2; // start from the 2
        int least = Least(num1, num2);  // takeing the least number
        while (i < least) { // checking the every number is less then the least number theat is true
            if (num1 % i == 0 && num2 % i == 0) {  // that number is divide by the num1 & num2 which is equal 0 that is gcd of number
                gcd = i;
            }
            i++;
        }
            return gcd; // returning the gcd of the number
        }
        public static int Least( int num1, int num2){
            if (num1 < num2) {  // this function will help to the find the least number which is enter by the user
                return num1;
            } else {
                return num2;
            }
        }
    }

