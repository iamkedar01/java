import java.util.*;
class FactorialofNumber {

    static int factorial(int num){
        int result=1 ; // the result is set to the 1 bcz any number less then 2 factorial is 1
        for(int i=2;i<=num;i++ ){ // here loop start from the 2 amd iterate till the give number
            result =result*i; // factorial works like the multipleing the last digit 1*2*3*4*5 = 120
        }
        return num;
    }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num = in.nextInt();
         int fact =factorial(num);
         System.out.println("The Factorial of "+num +" is: "+fact);

     }

}
