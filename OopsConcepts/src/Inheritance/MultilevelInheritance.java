package Inheritance;
class  Shape1 {
public void area() {
    System.out.println("Displays Area of Shape");
}
}
class Triangle2 extends Shape1 {
    public void area(int h, int b) {
        System.out.println(0.5*b*h);
    }
}
class EquilateralTriangle extends Triangle2 {
    int side;
    void area(int side){
        System.out.println("The side of the EquilatralTriangle is :"+ side);
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Shape1 s1 = new Shape1();
        s1.area();

        Triangle2 t1 = new Triangle2();
        t1.area(12,33);

        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(12);

    }

}
