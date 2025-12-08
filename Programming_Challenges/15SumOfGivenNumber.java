
import java.util.*;
class SumOfGivenNumber {
    public static int Sumofnum(int num){
            int sum =0;
            for(int i=1;i<=num;i++){
                sum+=i; //sum = sum + i;
            }
    return sum;
    }

    // useing the formula method sum = (n*(n+1))/2
    public static int findSum(int num){
            return (num * (num+1))/2;
    }

     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = in.nextInt();
         int sum = Sumofnum(num);
         System.out.println("The sum of the numbers till the "+num+" is : "+sum);

         System.out.println("Printing the useing the formula method the sum of the "+num+" is :"+ findSum(num));
     }

}
