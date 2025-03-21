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

        System.out.println(("First number is "+ Number1));
        System.out.println("Second number is "+Number2);

    }
  // Here  using the int type of funcation that will give the return type value 
  // this below cod ewill help for the reading hte input from the user using the funcation 
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