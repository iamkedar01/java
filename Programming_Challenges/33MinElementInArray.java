import java.util.Scanner;

 class MinElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; // where the n while decide the how much element must be present in the array

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is minimum
        int min = arr[0];

        // Find minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }


        // Output result
        System.out.println("Minimum element in the array is: " + min );

        sc.close(); // better codeing practice

    }
}
