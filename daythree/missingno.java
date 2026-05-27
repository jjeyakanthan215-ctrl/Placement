public class missingno {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1}; // Example array with numbers from 0 to 9 with one missing number
        int n = arr.length + 1; // Total numbers from 0 to n-1
        int totalSum = (n - 1) * n / 2; // Sum of first n natural numbers (0 to n-1)
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num; // Sum of elements in the array
        }

        int missingNumber = totalSum - arrSum; // The missing number is the difference
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
