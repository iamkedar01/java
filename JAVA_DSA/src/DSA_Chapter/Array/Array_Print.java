package DSA_Chapter.Array;

import java.sql.SQLOutput;

public class Array_Print {
    public static void main (String[] args){
        // dirct input
       int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

       // printing a array in a single useing the for loop
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +" ");  // here we use the ln it will goto the new line

        }

        System.out.println(); // this line is used to print the two diffrent output in trminal


        // To Print the array useing the for each loop
        // In this method we useing the a variable that is num used to print every number in the array
        /* The syntax of the of the for each loop is give below
          for (datatype  anyname:variable of array){
                System.out.println(Anyname +" " ); The spaace is used to print in a single line

         */
        for (int num:arr){
            System.out.print(num +" ");
        }
    }
}
