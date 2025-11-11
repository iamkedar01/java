package UserDefinedException;
// here the detail exlination of the user defined  exception
/*
First we need to create the exception name class which extends the Exception class
second create a parameterized constructor which take the message as the parameter
third pass that message to the Exception class like this Super(message or mess)
 in the last  create the default constructor

 Here the below  created the user-defined exception
 */

class AgeException extends Exception{
    AgeException(String message ){
        super(message ); // this the  message passing to the  Exception class useing the super
    }
    AgeException(){} // this is the default constructor defined by the user not given by the JDK
}
// This  is the sprarte  class for the user defined Exception that will pass to the main Exception class

class Customer {
    void setAge(int age ) throws AgeException { // when you use the throw inside the method always use throws bcz it's syntax rule
        if (age < 18 || age >60)
            throw new AgeException("Age should be between 18 and 60 ");
        else
            System.out.println("Your age " + age );

    }


}


public class CustomExceptionDemo {
    public static void main(String[] args){
        Customer c = new Customer();

        try{
            c.setAge(2);  // now calling the method inside the try block if
        }catch (AgeException e){  // it will catch the AgeException and print what we defined in the above throw block
            //System.out.println(e); // it used print the type of exception and message
            // here you want print the only message not what type of exception then use this given below
            System.out.println(e.getMessage());
            // here the another one very important method for the developer which is help to find the which line exception is came
            e.printStackTrace(); // like this given below  in multiple comments
            /*
            UserDefinedException.AgeException: Age should be between 18 and 60
	        at UserDefinedException.Customer.setAge(CustomExceptionDemo.java:23)
	        at UserDefinedException.CustomExceptionDemo.main(CustomExceptionDemo.java:38)
             */


        }

}
}