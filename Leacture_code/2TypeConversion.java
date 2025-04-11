 class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println("\nBefore type converstion: "+ myFloat); 
        // here i am using the "\n" to move the newline
        int myInt = (int) 5.45f; //float is covrting into a integer by explicit bcz float is grater then integer.
        System.out.println("After type converstion: "+ myInt); 


        int num = 10;
        System.out.println("\nBefore type converstion: "+ (num));  
        /*Integer is smaller then the float java converted automatically
          we don't need  to declare expicitily 
          */

        float num1=num;
        System.out.println("After the type converstion: "+num1+"\n"); 
        // this sprate "\n" new line will move the cursor to next line as showen in output
    }
}