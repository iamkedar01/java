package Encapsuation;
import java.util.*;
class Bank{
    public String name ;
    protected String email ;
    private  String Password;
     // to access the private data we sue the getter and setter methods in java
    public String getPassword(){
        return  this.Password;
    }
    public void setPassword(String pass){
        this.Password = pass;
    }


}

public class Encapsulation {
    public static void main(String[] args) {
        /*
        Encapsulation is the process of combining data and functions into a single unit called class.
         In Encapsulation, the data is not accessed directly;
        it is accessed through the functions present inside the class
         */

        Scanner in = new Scanner(System.in);


        Bank a1 = new Bank();
        System.out.println("Enter Your name :");
        String name = in.next();
        a1.name=name;
        System.out.println("Enter Your E-mail:");
        String email = in.next();
        a1.email=email;
        System.out.println("Enter Your password ");
        String pass = in.next();
        a1.setPassword(pass);

       // to verify the data we print the values
        System.out.println(" The name of the customer is :"+ a1.name);
        System.out.println("The Email of the customer is : "+ a1.email);
        System.out.println("The Password of the Cusomer is :"+a1.getPassword());
        //  here we can  observe the while accesing the data we dirctly can't accees the data in which are  private so use the methods
    }
}

/*
n simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes.
Thus, encapsulation makes the concept of data hiding possible.
(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies.
 e.g. "protected", "private" feature in Java).

 */
