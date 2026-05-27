import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr2 = new int[n];
        //input from user
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        //output
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}