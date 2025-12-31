class MaximumInArray {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 67};
        // Assume first element is maximum
        int max = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}
