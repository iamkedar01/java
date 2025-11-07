import java.util.*;

/*
- An exception is a runtime error which occurs during program execution
   and terminates the program abnormally
- Exception Handling is used to avoid abnormal termination of application
  and makes the program robust(strong)

 */

public class ExceptionDemo {
    public static void main (String[] args) {

//        System.out.println("Start of the programm");
//        int a = 2;
//        int b = 0;
//        int div = a / b;
//        System.out.println("Result is " + div);
//        System.out.println("End of the programm ");
        // we can observe the below code starting line number 14 is excecuted as it's



try{
    System.out.println("Start of the proramm");
    int a = 2;
    int b = 0;
    int div = a/b; // here excpetion will accure after excution will stop goto the catch block
    // the below code will ignore
    System.out.println("Resukt is "+div);

} catch (Exception e) {
    {
        System.out.println("Zero division not posible " +e); // this is the user define message and also e built in message
       // System.out.println(e); // this is the given by the built-in

       // note that to print message in red color we use the err insted of out
        System.err.println("Zero dicision error"); // you can see in the output
    }
}
        System.out.println("End of the programm ");



    }
}

