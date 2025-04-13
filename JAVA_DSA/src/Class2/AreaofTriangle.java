package Class2;
import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the Triangle:");
        double base = in.nextDouble();
        System.out.print("Enter the hight of the Triangle:");
        double hight  = in.nextDouble();

        double Area = 0.5 * base * hight;
        System.out.println("The area of the Triangle is : "+Area);


    }
}
