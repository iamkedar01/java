package Polymorphism;
//-------------------------------------------------------------------------------------------
class Shape{
   public double calculatearea(double radius){return 3.14*radius*radius;} // Math.PI also we can use
   public double calculatearea( double length, double width){return length * width ;}
    // as we can  see the two methods are same name with diffrent parameter
    // defined in the parent class or the superclass
}
//-------------------------------------------------------------------------------------------
class Cricle extends Shape {
    private double radius ;
    public Cricle(double radius){
        this.radius =radius;
    } // this is the construtcotor

    public double calculatearea() {
        return 3.14 *radius* radius;
    } // this alreday dife in the super class or parent class
}
//-------------------------------------------------------------------------------------------
class Rectangle extends Shape{
    private double length , width;
    public Rectangle(double length , double width ){
        this.length =length;
        this.width =width;
    }
    public double claculatearea(){
        return length* width;

    }
}

// in the above both class we created a constructor after that define the method which present in the parent class
// similar name is given
//-------------------------------------------------------------------------------------------
public class RunTimePolymorphism {
    public static void main(String[] args) {

//-------------------------------------------------------------------------------------------
        Shape s1 = new Shape();
        s1.calculatearea(2); // here it will calculate the value but not print the
        System.out.println( s1.calculatearea(2));

        s1.calculatearea(12,22);
        System.out.println(s1.calculatearea(12,22));

//-------------------------------------------------------------------------------------------
        Cricle c1 = new Cricle(7.2);
        c1.calculatearea(); // here we not passing the any parameter still geting the answer.
        // bcz we useing the parameter constructor in the Cricle class
        System.out.println(c1.calculatearea());
//-------------------------------------------------------------------------------------------
        Rectangle r1 = new Rectangle(12 ,22);
        System.out.println(r1.claculatearea());
    }
}
/*
Runtime Polymorphism : Runtime polymorphism is also known as dynamic polymorphism.
Function overriding is an example of runtime polymorphism.
 Function overriding means when the child class contains the method which is already present in the parent class.
 Hence, the child class overrides the method of the parent class.
 */
 /*
    Method Overriding is implemented by providing a new
 implementation for a method in a subclass that is already defined
 in its superclass.
     */