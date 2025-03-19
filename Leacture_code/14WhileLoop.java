import java.util.*;
class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = input.nextInt();

        while (Num <=10){
            System.out.print(Num);//printing the all in a same line 
            Num +=1;

        }
    }
    
}
