import java.util.Scanner;
class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        sc.close();
    }
}
