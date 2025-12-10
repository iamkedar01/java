import java.util.*;
class ReverseDigit {
    static  int reverseDigit(int num){
        int revNum = 0;
        while(num>0){
            revNum = revNum * 10 + num % 10;
            num = num /10;
        }
        return revNum;
    }

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.print("Enter a Number: ");
         int num = in.nextInt();
         int rev =reverseDigit(num);
         System.out.println("The reverse of the "+num+" is: "+rev);


     }
}
