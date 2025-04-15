package Class2;

import java.util.Scanner;

public class AgeClassifiction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a your Age : ");
        int   age  = in.nextInt();
        if(age >=60){
            System.out.println("your a senior citizion");
        } else if (age<60 && age >=20) {
            System.out.println("your an Adult ");
        }else if(age<20 && age>=13){
            System.out.println("your an Teenager");
        } else{
            System.out.println("your a child");
        }
    }
}
