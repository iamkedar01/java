package ThisKeyword;
class Student{
    String name ;
    int rollno;
    public void greeting(){
        System.out.println("\nWelcome to the Java Oops concept " + this.name);
    }
    public void Details(){
        System.out.println("The Student Name is: "+this.name);
        System.out.println("The student Roll Number is : "+ this.rollno);

    }
}
// Here we created a two  class
class Pens {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}
    public class ThisKeyword {
        public static void main(String[] args) {
            // the object creation of the class

            Student s1 = new Student();
            s1.name =" Kedar";
            s1.rollno = 1;
            s1.greeting();
            s1.Details();

            Student s2 = new Student();
            s2.name="Ram";
            s2.rollno=2;
            s2.greeting();
            s2.Details();
            System.out.println("\n");
        /*
         When we created the n number of the object in a same class its haed to under the current object calling
         so thats why the
                           this keyword refer to the current object of the class mean
                            using the which object your calling a class methods only refer to the that object only
          the Syntax of this is : it is used in the constructor and inside the methods as we seen in the above example
                            ----> this.variable name;
                      ---> this keyword refer to the current object
         */
            Pens p1 = new Pens();
            p1.color = "blue";

            Pens p2 = new Pens();
            p2.color = "black";

            Pens p3 = new Pens();
            p3.color = "red";

            p1.printColor();
            p2.printColor();
            p3.printColor();

/*
-----> Note: Inside the same package every class name must be different otherwise it will give the error
 */
        }
    }



