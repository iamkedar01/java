package Class3;

import java.util.Scanner;

public class MultificationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a new number:");
        int num = in.nextInt();
        printMulTable(num);

//        int i =1;
//        while(i<=10){
//            System.out.println(num+" x "+ i+ " = "+ num*i);
//            i++;
//        }
    }


    // this function should be outside the  main method
        public static void printMulTable  ( int num ){
            int i =1;
        while(i<=10){
            System.out.println(num+" x "+ i+ " = "+ num*i);
            i++;
        }
        }
    }