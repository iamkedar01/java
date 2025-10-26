package Polymorphism;
class Student3 {
    String name;
    int age;

    public void info(String name ) {
        System.out.println("The student name is : " + name);
    }
    public void info( int age ) {
        System.out.println("The student age is : " + age);
    }

    public void info(String name , int age ){
        System.out.println("The student name is : " + name);
        System.out.println("The student age is : " + age );
    }
}

public class ComplieTimePolymorphism {
        public static void main(String[] args) {
        /*
            Compile Time Polymorphism : The polymorphism which is implemented at the compile time is known as compile-time polymorphism.
             Example - Method Overloading

        Method Overloading : Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality.
        Method overloading can be possible on the following basis:
                            1. The type of the parameters passed to the function.
                            2. The number of parameters passed to the function.

         */

            Student3 s1 = new Student3();
            s1.info(74);
            s1.info("ram");

        }
    }


