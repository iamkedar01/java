import java.util.*;
 class Multiplication_Table {
     public static void MultifationTable(int num){
         for(int i =1;i<=10;i++){//condiction check
             System.out.println(num+" X "+i+" = "+num*i);
         }
     }
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = in.nextInt();
         MultifationTable(num);
     }
}
