package Class3;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: "); // 4
        int num = in.nextInt();

        int result = num << 1;
        System.out.println("The result is:"+ result);  // 8
    }
}
