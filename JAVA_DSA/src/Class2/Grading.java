package Class2;
import java.util.*;
public class Grading {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a your percentage: ");
        float  per = in.nextFloat();
        if(per >=90){
            System.out.println("your grade is A ");
        } else if (per<90 && per>=75) {
            System.out.println("your grade is B ");
        }else if(per<75 && per>=60){
            System.out.println("your grade is C ");
        }else if( per<60 && per>=35){
            System.out.println("your grade is D 'just pass'");
        }else{
            System.out.println("your grade is F 'your failed'");
        }
    }
}
