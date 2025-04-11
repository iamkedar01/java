class Ifelse_injava {
    public static void main(String[] args) {
        boolean isMale = true; // value is true means we entering the men Male name 
        String name = "Kedar";

        System.out.println();
        if (isMale) {

            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        System.out.println();

        boolean isSeniorCitizen = false; // false means he is not a seniorcitizen 
        boolean isAnAdult = true;  // he is an adult

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if (isAnAdult) {   // it is used to run the one or more condtion
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Child");
        }  
        /* if --> it used  for the only one condition
         * if-else ----> it used for if contion fails inside the else statement will print
         * else-if ----> this work on the based on the if condition its fails it check the else if condition 
         *  based  on that condition code will excute 
         * example is above code.
         */
    }
    
    
}
