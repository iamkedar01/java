import java.util.Scanner;
class OddEven {

    public static boolean isEven(int num) {
        int rem = num % 2;
        if (rem == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (isEven(num) == true) {
            System.out.println("The number " + num + " is Even Number ");
        } else {
            System.out.println("The number " + num + " is Odd Number");
        }
    }
}