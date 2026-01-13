import java.util.Scanner;
class LargestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number -1");
        int a = sc.nextInt();
        System.out.println("Enter a number  - 2");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Largest = " + a);
        else
            System.out.println("Largest = " + b);
    }
}
