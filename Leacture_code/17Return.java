import java.util.Scanner;
class Return{
    public static void main(String[] args) {
        // using the function takeing a input from the user
        // here just declare the variable type and name  also call funcation
        // here we can take only integer type value only 

        greeting();
        int Number1 =readnumber(); 
        int Number2 = readnumber();
        int  num3 = readnumber();
        System.out.println();//this make a newline  after takeing the input from the user

        System.out.println("First number is "+ Number1);
        System.out.println("Second number is "+Number2);
        System.out.println("Second number is "+num3);


    }
  // Here  using the int type of funcation that will give the return type value is integer
  // this below code will help for the reading the input from the user using the function
    public static int  readnumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a number:");
        int  number = input.nextInt();
        return number;
    }
    public static void  greeting (){
        System.out.println("Welcome to the Return type function");
}
}