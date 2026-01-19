import java.util.Scanner;
 class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character from (a to z and A to Z):");
        char ch = sc.next().charAt(0);

        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch +" is Vowel");
        else
            System.out.println(ch +" is Consonant");
    }
}
