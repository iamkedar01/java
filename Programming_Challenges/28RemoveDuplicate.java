import java.util.Scanner;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        int count = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
sc.close();
    }
}
