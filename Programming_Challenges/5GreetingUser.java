import java.util.Scanner;
class GreetingUser {
    public static void main (String args[]){

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your name: "); // if you use the println cursor will move to the next line 
        String name = input.next();

        System.out.println("Hi "+name+ ", Welcome to the java programming language");

    }
}