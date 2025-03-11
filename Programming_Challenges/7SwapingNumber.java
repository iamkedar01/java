 import java.util.*;
 class SwapingNumber { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nSwaping to two  number using the Third variable...!\n"); 
     /* The First one will move the cursor to the next line make diffrence form starting position 
      * The Last on will move the next line make the diffrence b/w heading and User input
      */

    System.out.print("Enter the First number:");
    int Num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    int Num2 = input.nextInt();

    System.out.println("\nBefore Swaping the numbers"); // "\n"--> it will take the next line in your output
    System.out.println("The First NUmber is :"+Num1);
    System.out.println("The Second Number is : "+ Num2);

    int Num3 = Num1; // Here Num3 is Intialize and assign the Num1 value 
        Num1 = Num2;// here also exchangeing the values 
        Num2 = Num3;

        System.out.println("\nAfter Swaping the numbers");
        System.out.println("The First NUmber is :"+Num1);
        System.out.println("The Second Number is : "+ Num2);
    
 }
    
}
