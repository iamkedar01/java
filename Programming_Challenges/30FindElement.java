import java.util.Scanner;

 class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];//Create a user defined array with length
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: "); // use key find the element in array
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(key + " not found in the array.");
        }

        sc.close();
    }
}
