import java.util.Scanner;
public class Array1 {

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        //input from user
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 
