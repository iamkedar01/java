package DSA_Chapter.Array.ArrayProblems;

public class MaxRange {
    public static void main(String[] args) {

        // these program is help to find the max value in spcific range inside the array
        int[]  arr = { 12,2,3,34,56,78,99,75};
        System.out.println(maxRange(arr,0,5));

    }
    // here writeing  a another function that will give the maximum value in the array in spcific range
    static  int maxRange(int[] arr, int start , int end){
        int maxVal = arr[start];
        for(int i = start;i<=end;i++){
            if(arr[i]>maxVal){
                maxVal =arr[i];
            }
        }
        return maxVal;
    }
}
