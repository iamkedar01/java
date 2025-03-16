import java.util.*;

class Relation_opertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = input.nextInt();

        if(age >= 18){ // Here using the Relation opertion to check the condition
            System.out.println("Your Eligible to vote");
        }else{
            System.out.println("Your not eligible to vote");
        }
    }
    /* Here the some notes on the Relation Opertion 
     * 1) " == " it is used to check the equality
     * 2) " != " its is used to check the in equality
     * 3) " >= " Graterthen or equal
     * 4) " <= " Lessthen or equal
     * 5) " > " Graterthen
     * 6) " < " Lessthen
    */
    
}
