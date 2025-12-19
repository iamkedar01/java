import java.util.Scanner;

 class CheckArrayEmpty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (arr.length == 0) {
            System.out.println("The array is empty.");
        } else {
            System.out.println("The array is not empty.");
        }


    }
}
