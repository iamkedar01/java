package Class2;
 import java.util.*;
public class LeapYear {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter  a year: ");
        int year = in.nextInt();

//        if ( year % 400 ==0){
//            System.out.println("it is a leap year");
//        }else if(year %4 == 0 && year % 100 !=0 ){
//            System.out.println("it is a leap year");
//        }else{
//            System.out.println("it is a not a leap year");
//        }
        if (year % 400 ==0 || year %4 == 0 && year % 100 !=0){
            System.out.println("it is a leap year");
        }else {
            System.out.println("it is a leap year");
        }
    }
}
