package Constructor;
class Student1{
    String name ;
    int rollno;
    int age ;

    // the creation of the constructor is read the note in main method
    Student1(){ // this is the non parameterized construtor
        System.out.println("the constructor is called ");

    }


    Student1(String name, int age , int rollno) { // this is the parameterized constructor
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    public void info(){
        System.out.println("the student name is : "+ this.name);
        System.out.println("The Student age is : "+ this.age);
        System.out.println("The student Roll number is :" + this.rollno);

    }

}
    public class ConstructorInJava {
        public static void main(String[] args) {
        /*
        Constructor : Constructor is a special method which is invoked automatically at the time of object creation.
         It is used to initialize the data members of new objects generally.
             ----> Constructors have the same name as class or structure.
            ---->  Constructors don’t have a return type. (Not even void)
           ----->  Constructors are only called once, at object creation.
            -----> the Syntax is : Classname(){ ....}
             the name muste be same as the classname and () brackets after that
             write the content inside the flower-bracket as i mentioned {...}


            Three type of the constructor is given below with explination in details
            1. Non-Parameterized constructor
            2. Parameterized constructor
            3. Copy Constructor (this not used most of the  time)

            in above class i give the example of the each constructor

         */
            Student1 s1 = new Student1();
            // here when you create a object jvm check the any constructor is created or not id find excuted that
            // otherwise it will create it's own default  constructor

            Student1 s2 = new Student1("kedar",21  , 2);
            s2.info();




        }
    }


