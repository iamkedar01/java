package DSA_Chapter.Array;
import java.util.*;
import java.util.Arrays;

public class TwoD_Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // declaration
        // datatype [][] arr = new datatype [][] ;
        int [][] arr = new int [3][3]; // must declare the size of the array

//        // Direct declartions
//        int [][] arr = {{1,2,3}, {3,4,6}, {5,6,7},};
//        System.out.println(arr[1]);

        // Takeing the input of the 2d array
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= in.nextInt();
            }
        }

        // To print the 2D array
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " "); // use only print
            }
            System.out.println();// here add only print that will println in a single line
        }

        // useing the Arrays.tostring method
       // we use the to string method that will give in the array from in the matrix from
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        // Using the for each loop
        // when we use the for each loop be aware of the to mention the [] like this
        for (int[] num : arr){
            System.out.println(Arrays.toString(num));
        }


    }
}

