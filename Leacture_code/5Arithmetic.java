import java.util.Scanner;
class Arithmetic {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Arithmetic opertion\n");

        // here takeing the input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int FirstNum = input.nextInt();
        System.out.print("Enter the Second Number(this not be zero) : ");
        int SecondNum = input.nextInt();

        System.out.println(FirstNum + SecondNum);  // Add the to number  give the sum 
        System.out.println(FirstNum-SecondNum); // Subtract the two number give the sub
        System.out.println(FirstNum*SecondNum); // give the multiplication of two number
        System.out.println(FirstNum/SecondNum); // it give the divider
        System.out.println(FirstNum%SecondNum); // it gives the reminder
    }
}