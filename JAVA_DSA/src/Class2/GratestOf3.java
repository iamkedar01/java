package Class2;
import java.util.*;

public class GratestOf3 {
    public static void main(String[] args) {

        // here using the float bcz it works for both int aand float
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float num1 = in.nextFloat();
        System.out.print("Enter the second number:");
        float num2 = in.nextFloat();
        System.out.print("Enter the third number:");
        float num3 = in.nextFloat();
        // logic part

//        float max = num1;
//        if(num2>max){
//            max = num2;
//            System.out.println("The maximum number is:"+num2);
//        }
//        else if (num3 >max){
//            max = num3;
//            System.out.println("The maximum number is "+num3);
//        }
//        else{
//            System.out.println("the maximum number is:"+max);
//        }

        // another logic of this program
        if(num1 >= num2 && num1 >= num2){ // num1 is camaparing with both num1 and num2
            System.out.println("The maximum number is:"+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("The maximum number is:"+num2);
        }
        else{
            System.out.println("The maximum number is:"+num3);

        }

//        // another logic is there
//        int max = Math.max(num1, Math.max(num2, num3));
//        System.out.println("The maximum number is: " + max);


    }
}
