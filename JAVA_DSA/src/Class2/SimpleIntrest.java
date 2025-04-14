package Class2;
import java.util.*;
public class SimpleIntrest {
    public static void main(String[] Args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle ammount:");
        int p = in.nextInt();
        System.out.print("Enter the rate of the intrest(on which percntage):");
        float r= in.nextFloat();
        System.out.print("Enter the how many days you take the many:");
        int t = in.nextInt();

        float Simpleintrest = (p*t*r)/100;
        // p= principle
        // r = rate of intrest
        // t = time
        System.out.println("The simple intrest is : "+Simpleintrest);
    }
}
