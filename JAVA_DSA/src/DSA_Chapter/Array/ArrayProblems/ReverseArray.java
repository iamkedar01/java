package DSA_Chapter.Array.ArrayProblems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
         int[]  arr = {12, 23 , 56 , 98 , 45 ,25 ,321 };
         reverse( arr);
        System.out.println(Arrays.toString((arr)));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end ) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
