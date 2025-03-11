
import java.util.Scanner;

 class Sum { public static void main(String[] args) { // This line is then starting point of the programiing 
    Scanner input = new Scanner(System.in); // this line will help in takeing the input from the user 
    System.out.println("Welcome to the Simple Addition Programming ");

    System.out.print("Enter the first number: ");  // Takeing the input from  the user 
    int Num1 = input.nextInt();
    System.out.print("Enter the Second Number: "); // "ln" is removed bcz to print in same line and also given a space 
    int Num2 = input.nextInt();

    float Sum = Num1 + Num2 ; /* This is a Multi comment
    Perfrom the addition opertion and give the sum 
    the sum of two number is in the from of the float */ 

    System.out.println("The sum of "+Num1+ " and "+Num2+" is: "+Sum); 

 }
    
}
