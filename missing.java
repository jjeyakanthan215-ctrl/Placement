public class missing {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = arr.length;
        findMissing(arr, n);
    }
    public static void findMissing(int[] arr, int n) {
        boolean found = false;
        // Loop through the array to find the mismatch
        for (int i = 0; i < n; i++) {
            if (arr[i] != i) {
                System.out.println("Missing number: " + i);
                found = true;
                break; // Stop searching once found
            }
        }
        if (!found) {
            System.out.println("Missing number: " + n);
        }
    }
}