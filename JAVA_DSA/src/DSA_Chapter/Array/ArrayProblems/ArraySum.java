package DSA_Chapter.Array.ArrayProblems;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = in.nextInt();
        int[] arr = new int[size];


        System.out.println("Enter the " + size + " of the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
           // sum = sum + arr[i];  // here we can print direct
        }
        // System.out.println("The sum of the array is:" + sum) ;


        System.out.println("The sum of the array is:" + sum(arr , sum)) ; // here we useing the Function
    }
// always note that function must be return that outside the main method


    static int sum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum ;
    }
}