package Class2;
import java.util.*;
public class ParimeterofRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a length of rectangle of parimeter:");
        float l = in.nextFloat();
        System.out.print("Enter a width of rectangle of the parimeter:");
        float w = in.nextFloat();

        float parimeter = 2 *(l+w);
        System.out.println("The Perimeter of the rectangle is: "+ parimeter);

    }
}
