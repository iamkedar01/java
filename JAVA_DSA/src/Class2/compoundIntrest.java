package Class2;
import java.util.*;
public class compoundIntrest {
    public static void main(String[] Args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle ammount:");
        int p = in.nextInt();
        System.out.print("Enter the rate of the intrest(on which percntage):");
        float r= in.nextFloat();
        System.out.print("Enter the how many days you take the many:");
        int t = in.nextInt();
        double compoundIntrest = p *Math.pow((1+r/100) ,t);
        // p= principle
        // r = rate of intrest
        // t = time
        System.out.println("The simple intrest is : "+compoundIntrest);
    }
}
