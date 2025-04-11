import java.util.Scanner;
class Shorthand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x1 = input.nextInt();
        //a = a + x1;
         a += x1;// easy way to write the addition or anything mul,sub,div,rem etc
        System.out.println(a);

        System.out.print("Enter a number: ");
        int x2 = input.nextInt();
        a = a + x2;
        System.out.println(a);

        System.out.print("Enter a number: ");
        int x3 = input.nextInt();
        a = a + x3;
        System.out.println(a);

        System.out.print("Enter a number: ");
        int x4 = input.nextInt();
        a = a + x4;
        System.out.println(a);

        // in this programm useing a value is constant and
    } 
}
