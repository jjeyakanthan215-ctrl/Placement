public class diagonal {
    public static void main(String[] args) {// diagonal of array without printing the 5 in the middle
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}