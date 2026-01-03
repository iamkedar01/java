import java.util.Arrays;
class Swap {
    public static void main(String[] args) {
        int[] arr = {12,2,3,56,37,23,7,9};
        swap(arr,1,5 );

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1 , int index2){ // here must check the parameter type how many parameter
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        // here also check the where we need to change the value like inside array so check the code is properly return
        // like arr[index] mean we changeing the inside the value in the array
    }
}