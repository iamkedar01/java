import java.util.Scanner;

class sumOfDigits {
    static int sumOfDigits(int num){
        int sum =0;
        while(num!=0){
            int last = num % 10; // Exrract the last digit
            sum = sum +last; // adding into a sum of the value
            num = num / 10; // after adding the value remove the digit
        }
        return sum;
    }
    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the value of any digits: ");
  int num = in.nextInt();
  int sum = sumOfDigits(num);
  System.out.println("The sum of the "+num+" Digits is: "+sum);

    }
}
