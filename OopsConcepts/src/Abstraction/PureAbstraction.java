package Abstraction;
interface Animal2{
    int eyes =2; // the variable are the fixed like final for every animal
    void walk(); // here we can declare only absract method only
    // the method which are inside the interface they public and abstract by default
    // but we need to declare in the child class as a public method

}
interface Herbivore{ // the Herbivore means which eats grass
    String grasscolor = "green";
    void eat();
}
 // here we declare two interface
class Horse implements Animal2 , Herbivore{ // this is the multiple inheritance
    @Override
    public void walk() {
        System.out.println("\nThe Horse walk on the 4 - leg");
        System.out.println("The number of eyes of the horse is :"+ eyes);

    }
    public void eat(){
        System.out.println("The Horse eats the " +grasscolor +" grass");
    }
}
public class PureAbstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();



    }

}
// the pure abstraction can be achived useing the interface
// the declaration of the interface is useing the keyword interface after that classname
// example : interface animal
//  In interface we can not declare the constructor inside the interface it will give the error
