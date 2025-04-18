package Class3;

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();

        if((num & 1) ==1){
            System.out.println("its a odd number");
        }else{
            System.out.println("its a even number");
        }
    }
}
