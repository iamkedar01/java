package MultipleCatch;

public class MultipleCatchException {
    public static void main(String[] args){

        System.out.println("Start of the Program");
        try{
            int a = Integer.parseInt(args[0]);  // when you give the input as argument then while runing the program
            int b = Integer.parseInt(args[1]);  // Run and debug then click run configuration where give the arguments
            int res = a/b;
            System.out.println("Result is : "+ res);
        }
        catch(ArithmeticException e){
            System.err.println("Divide by zero is not allowed");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Requried two numbers");
        }
        catch(NumberFormatException e){
            System.err.println("Enter only numbers");
        }
        catch(RuntimeException e){
            System.err.println("Runtime Exception");
        }
        catch(Exception e){  // this Exception is super class for all  the above class it is always return below
            System.err.println("Exception occuried "+e);
            // if you write is first it will give the error
            // and there is no meaning amd use the  writeing all the class bcz  it handle every class
            // if you write last mean except this if any other exception occur that will handle

        }

        System.out.println("End of the program");

    }
}

