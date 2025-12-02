import java.util.*;
class AddtoNumber {
    public static void main(String[] args ){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number-1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number-2");
        int num2 = in.nextInt();
       int  result = add(num1 ,num2);
        System.out.println("The sum of the two Number is :"+ result);

    } // note that every funtion must be write out side the main class in side the class
    public static int  add(int num1 , int num2){
        int result = num1 + num2;
        return result ;

    }
}
