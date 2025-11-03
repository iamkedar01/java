package DSA_Chapter.Array;
import java.util.*;
public class ArrayCreate {
    public static void main(String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        System.out.println("Enter the " + size + " of the values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("To print the all elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The index " + i + " element is :" + arr[i]);
        }
    }

}
