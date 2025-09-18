package Inheritance;
class shape {
    void area() {
        System.out.println("Area Displyaed");
    }
}
//------NOTE alwalys maintain the subclassouside the main class----------------------------------------------------------------------------------------------
class Triangle extends shape{
        void area(int height , int bidth  ){
            System.out.println("The area of the Triangle is "+ (0.5* height*bidth));
        }
}

public class SingleInheritance {
    public static void main(String[] args) {
        shape s1 = new shape();
        s1.area();

        Triangle t1 = new Triangle();
        t1.area(12,2);

    }
}
