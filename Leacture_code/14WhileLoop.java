import java.util.*;
class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Num = input.nextInt();

        while (Num <=10){  //you enter the 10 then it will print , with 10 like this ,10
            System.out.print(Num+",");//printing the all in a same line
            Num +=1;

        }
        // Loop is widely used for slove in easy way using shor-time of period
    }
    
}
