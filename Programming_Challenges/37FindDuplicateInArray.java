 class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 3, 8, 5, 6, 2, 9};
        System.out.println("Duplicate elements in the array:");
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;   // avoid printing same duplicate multiple times

                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }

    }
}
