class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(7,5));  // giveing the two inputs in parameters
        // System.out.println(sumTwoNumbers(5, 9));
        // System.out.println(sumTwoNumbers(-67, 67));
    }

    public static int sumTwoNumbers(int Num1, int Num2) {  
        System.out.println("First Number received: " + Num1);
        System.out.println("Second Number received: " + Num2);
        return  Num1 + Num2; // it will return the intger type value 

        // Last one line is also enough of to write addition of two number 
        // printing the what recived from the parameters 
    }
}