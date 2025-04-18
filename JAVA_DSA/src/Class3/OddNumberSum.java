package Class3;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = oddSum(num);
        System.out.println("The oddsum till "+num+" is "+ sum);
    }

    public static int oddSum(int num){
        int sum =0;  // variable intilizations
        int i=1;
        while(i<num){
            sum +=i ; // this for the adding the numbers
            i +=2 ;  // this for increment by 2 get the odd number only
        }
        return sum ;
    }

}
