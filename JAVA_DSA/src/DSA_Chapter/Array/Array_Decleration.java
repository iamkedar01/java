package DSA_Chapter.Array;

public class Array_Decleration {
    public static void main(String[] args){
        // datatype []  variable name        =    new datatype [size];
        //this will happen at complie time     // this will happen at runtime
        //   this is a normal declartion

        /* Direct declartions give below:
            int [] arr = {1,2,3,4,5,6,7};

         */
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(arr[1]);

        String [] str = new String[5];
        System.out.println(str[3]);

        // Here we can add the value like in above array str
        str[0]="kedar";  // Adding the value at the spcific position at the index number 0
        str[4]= "Dhage";
        System.out.println(str[0]);
        System.out.println(str[4]);
    }
}
