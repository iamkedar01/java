package DSA_Chapter.Array.ArrayProblems;

public class MinRange {
    public static void main(String[] args) {
        int[] arr = {12,43,23,544, 1 ,0, 23,4, 567,3};


        System.out.println(minRange(arr,0,3));

    }

    static int minRange(int[] arr ,int start , int end ){

        int minVal = arr[start];
        for(int i = start; i<= end;i++){
            if(arr[i]<minVal){
                minVal =  arr[i];
            }
        }
        return minVal;
    }
}
