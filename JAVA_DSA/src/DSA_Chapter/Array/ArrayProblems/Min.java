package DSA_Chapter.Array.ArrayProblems;

public class Min {
    public static void main(String[] args) {
    int[] arr = {12,43,23,544, 1 ,0, 23,4, 567,3};

    //    int[] arr = { };

        System.out.println(min(arr));

    }

    static int min(int[] arr ){

        if (arr == null || arr.length == 0) {
            return -1; // or throw new IllegalArgumentException("Array is null or empty");
        }

        int minVal = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<minVal){
                minVal =  arr[i];
            }
        }
        return minVal;
    }
}
