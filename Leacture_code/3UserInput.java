import java.util.Scanner;
class UserInput {
    // some code is written in inside the comments line
    public static void main(String[] args){
        // This about takeing the string input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: "); 
        String name = input.next(); // the next will take only one string if want insert full sentence "nextLine()"
        System.out.println("Hi, "+name+" Welcome to the java....!"); // before the welcome word give the space to clear output


        // This about the takeing the integer input from the user
        System.out.print("Enter your age: ");
        int Age = input.nextInt();                   // "4byte"
        System.out.println("your age is : "+ Age);

    //     // This about the takeing the integer input from the user
    //     System.out.print("Enter a Float number: ");
    //     float myFloat = input.nextFloat();                   // "4byte"
    //     System.out.print("The float number is : "+myFloat);   
    
    //    // This about the takeing the integer input from the user
    //     System.out.print("Enter a Double number: ");
    //     Double MyDouble = input.nextDouble(); //  it is used for the store the large decimal values and "8 bytes"
    //     System.out.println("your age is : "+ MyDouble);   
    
    /*  similar are two are there present that are 
    1---> Short --> nextShort();  "2byte"
    2---> Long ---> nextLong();   "8byte"

            */
     }
}