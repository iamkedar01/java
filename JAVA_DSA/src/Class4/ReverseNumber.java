package Class4;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        int reverse = reverseNumber(num);
        System.out.println("The reverse of the number is: "+ reverse);

    }
    public static int reverseNumber(int num){
        int Reverse =0;  // takeing the new bariable to store the reverse digit of the number
        while(num>0){  // theis will check the enterd the number is grater then the zero loop will executed
            int digit = num %10; // this will devide the given  number by 10 then get the reminder
            Reverse = Reverse *10 + digit; // here adding the reminder into the reverse similar to store the other number use the multiple of the number
            num /= 10;  // use for the to divide the similar to next number also
              }
        return Reverse ;
    }
}

