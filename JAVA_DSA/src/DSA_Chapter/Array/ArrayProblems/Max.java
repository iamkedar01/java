package DSA_Chapter.Array.ArrayProblems;
import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3, 34, 56, 78, 99, 75, 100};
        int res = max(arr); // storeing the variable then printing the values
        System.out.println(res);
        // System.out.println(max(arr)); // dirct printing a array

    }

    // here note that every function must be outside the main function
    //here the return type of the function is integer
    static int max(int[] arr) {
        int maxVal = arr[0]; // here first  consider the array first element is max value
        for (int i = 0; i < arr.length; i++) { // it is used to iterate throught the array
            if (arr[i] > maxVal) { // campareing with each and every element
                maxVal = arr[i]; // it will return the max element in the array
            }
        }
        return maxVal;
    }
}


