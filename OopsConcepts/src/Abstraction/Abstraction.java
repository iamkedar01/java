package Abstraction;
abstract class Animal{
    /*  here the animal is not a spcific type so we can  make it as a abstract class means this data is not use nessesary to show the user
    the maily the abstract class is used in the prototype of the evey real world example like car , animal , bike etc
    using these we can create n number of objects

    ---> to make abstract class use the abstract keyword
      abstract means like blue print

     */
    Animal(){
        System.out.println("\nCreating a new animal ");
    }
    abstract void walk(); // the abstract method don't have the body.
    public void eats(){
        System.out.println("The Animal eats..!");
    }

}
class Dog extends Animal{
    Dog(){ // this is a constructor
        System.out.println("Creating a dog animal ");
    }
    public void walk(){
        System.out.println("Dogs walk on 4 legs ");
    }
}
class Penguin extends Animal{
    Penguin(){
        System.out.println("Created a Penguin Animal");
    }
    public void walk(){
        System.out.println("The penguin walk on 2 leggs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
        d1.eats(); // observe the in dog class not written any method still we can acccess bcz
        // dogs class inherite the properties of  the Animal class

//        Animal a1 = new Animal(); // cannot be instantiated
//        a1.walk(); // for abstract class we can't create a object but we cn use method and attribute in a subclass
      Penguin p1 = new Penguin();
      p1.walk();
      p1.eats();

    }
}

 // the whole notes is give in multiple comments
/* Abstraction:
        We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details.
        In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.
        Abstraction is achieved in 2 ways :
                                            1)    Abstract class
                                            2)    Interfaces (Pure Abstraction)
   1) Abstract Class
                - An abstract class must be declared with an abstract keyword.
                - It can have abstract and non-abstract methods.
                - It cannot be instantiated.
                - It can have constructors and static methods also.
                - It can have final methods which will force the subclass not to change the body of the method.




 */