package DSA_Chapter.Array;
import java.util.*;
public class Arrays_tostring {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int [5];

        int n= arr.length;
        for (int i =0;i<n;i++){
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        /*
        here we use the Arrays.tostring method to print the arr
         defination --> used to return a string representation of an object
         */
    }
}
