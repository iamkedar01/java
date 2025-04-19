package Class4;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = in.nextInt();
        int sum = SumofDigit(num);
        System.out.println("The Sum of the "+num+" is: "+sum);
    }
//    public static int SumofNum(int num){
//        int i =0;
//        int sum = 0;
//        while (i <= num) { // this less the equal include the present number also.
//            sum +=i;
//            i++;
//        }
//        return sum;
//    }
    public static int SumofDigit(int num){
    int sum =0;
    while(num>0){
        sum = sum + (num %10); // sum += (num %10); tis shortcut from
        num /=10;
    }

        return sum;

    }
}
