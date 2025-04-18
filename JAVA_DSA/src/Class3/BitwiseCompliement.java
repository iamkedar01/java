package Class3;
import java.util.*;
public class BitwiseCompliement {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();

        int result = ~num;
        System.out.println("The result is : "+result);
    }
}
