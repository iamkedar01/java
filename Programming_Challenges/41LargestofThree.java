import java.util.Scanner;

 class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number-1: ");
        int a = sc.nextInt();
        System.out.println("Enter a number-2: ");
        int b = sc.nextInt();
        System.out.println("Enter a number-3: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println(a + " is largest");
        else if (b >= a && b >= c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
    }
}
