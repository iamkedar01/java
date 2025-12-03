import java.util.*;
 class FactorialuseingRecursive {

    static int factorial(int num){
        if(num==0)
            return 1;
        return num * factorial(num-1); //method calling it self
    }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.println("Enter a number: ");
         int num = in.nextInt();
         int fact = factorial(num);
         System.out.println("Factorial of " +num+" is " + fact);

     }

}
