class Function {
    public static void main(String[] args) {
//        System.out.println("In main method");
//        greetUser();
//        System.out.println("Method calling complete");
       
        greetUser();
        printFirstPattern(); // Here calling that functions to print 

        //printSecondPattern();
//        printThirdPattern();
    }
  
     // These are the simple functions are methos
    public static void printThirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");      
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void printSecondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void printFirstPattern() {
        int rows = 0;  // initilaizeing the rows. this for how many lines of * to print 
        while (rows < 5) {
            System.out.print("*");
            int i = 0; // this i will help to print each line one how line incrase * will also incrase and print 
            while (i < rows) {  
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;   // here incementing the rows till the 5 (form 0 to 5 )
        }
    }

    public static void greetUser() {
        System.out.println("Welcomr to the Function In JAVA............!");
    }

}