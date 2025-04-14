package Class2;
import java.sql.SQLOutput;
import java.util.*;
public class CheckingNumPNZ {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        float num =  in.nextFloat();
        // here i used the float bcz it works for both the integer and the floating number also
        if (num >0){
            System.out.println("The number is positive");
        }
        else if(num < 0){
            System.out.println("The number is the negative");
        }
        else {
            System.out.println("The number is Zero");
        }
    }

}
