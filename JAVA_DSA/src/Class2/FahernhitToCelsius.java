package Class2;
import java.util.*;
public class FahernhitToCelsius {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Fahernhit number:");
        float f = in.nextFloat();
        float C =(f-32)* 5/9;
        System.out.println("The Celisus value of the fahernhit is: "+C);
    }
}
