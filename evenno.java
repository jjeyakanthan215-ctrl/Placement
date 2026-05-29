public class evenno {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int sum = 0;
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {   // check even
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + sum);
    }
}
