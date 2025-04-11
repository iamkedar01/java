import java.util.*; // it is predefined package in java that will contain the list ,Set & hash etc
// if you import this package don't need defined the  scanner package also
class Logic_in_ifelse{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Ticket Discount Calculator Based on the 'Age & Gender'");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) { // here it will check the age is less then 5 execute the this statement 
            System.out.println("You got 75% disagent");
        } else if (isFemale) { // if age is more then 5 here check the gender if it is female execute the statement
            System.out.println("You got 50% discount");
        } else if (age > 60 && !isFemale) { //age >60 & isnotfemale means men the execute this statement 
            System.out.println("You got 25% discount");
        } else { // execute this statement
            System.out.println("You got no discount");
        }
    }
}