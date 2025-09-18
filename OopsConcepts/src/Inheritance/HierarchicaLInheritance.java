package Inheritance;
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((0.5)*b*h);
    }
}
class Circle1 extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}
    public class HierarchicaLInheritance {
    public static void main(String[] args) {
        Shape s1 = new  Shape();
        s1.area();

        triangle t1 = new triangle();
        t1.area(2,12);

        Circle1 c1 = new Circle1();
        c1.area(12);


    }
}
