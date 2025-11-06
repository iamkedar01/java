package DSA_Chapter.Array.ArrayProblems;

import java.util.Scanner;

public class SearchInArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = in.nextInt();

        if (search(arr, key)) {
            System.out.println("Key " + key + " is found");
        } else {
            System.out.println("Key " + key + " is not found");
        }
    }
    static boolean search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
