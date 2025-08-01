package Class4;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a new number:");
        int num = in.nextInt();

        boolean isArmStrong = isArmStrong(num);


        if (isArmStrong){
            System.out.println("The number is ArmStrong");
        }else{
            System.out.println("The number is not  Arm strong");
        }
    }


    public static boolean isArmStrong (int num){
        int nodigits = noOdDigits(num);
        System.out.println("the noofdigit: "+nodigits);
        int finalnumber =0;
        while(num>0){
            int  Lastdigit = num % 10;
            num /=10;
            finalnumber += pow(Lastdigit,nodigits);
        }

     return finalnumber == num;
    }

    public static int pow(int num1 , int num2){
        int result = 1; // or num1
        int i =0; // or i =1; if use the num1 the her also the 1
        while(i<num2){
            result *= num1;
            i++;
        }
        System.out.println("pow of "+ num1+" is "+result    );
        return result;
    }

    public static int noOdDigits(int num){
        int digit =0;
        while(num<0){ //  this Function is used for calulate the how mnay numebrod digit is enterd by the user
            digit++;
            num/=10;
        }
        return digit;
    }


}
