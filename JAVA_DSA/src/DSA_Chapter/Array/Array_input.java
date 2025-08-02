package DSA_Chapter.Array;
import java.util.*;

public class Array_input {
    public static void main(String[] args) {

        /*The Array input can be taken useing the for loop with the help
        of the Scanner
         */

//        Scanner in = new Scanner(System.in);
//        int [] arr = new int[5];// must define the size of array
//
//        // takeing input form the user
//        for (int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//       }
//        // To print the all the element in above arrya using the for loop
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//            // here we add the println it not print in a single line
//        }

//        // this in main method we need to call the two methos using the classname.methodname(pass the paramter);

        int[] arr = new int[5];
        Array_input.input(arr);
        Array_input.print(arr);

        // input(arr); // In this must check the variable name will passing to the a method
        // print(arr); // direct printing of the static method
  }

    // here we can write the function ot method  for the takeing input array of integer we can use it letter



    static void input(int arr[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // here we add the println it not print in a single line
        }
    }
}
