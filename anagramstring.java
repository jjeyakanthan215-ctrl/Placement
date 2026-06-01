import java.util.Arrays;
import java.util.Scanner;
public class anagramstring {
    public static boolean isAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] C1 = s1.toCharArray();
        char[] C2 = s2.toCharArray();
        Arrays.sort(C1);
        Arrays.sort(C2);
        if (C1.length != C2.length){
            return false;
        }
        for( int i=0; i<C1.length; i++){
            if (C1[i] != C2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the first string:");
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        System.out.println("enter the second string:");
        String str2 = s.nextLine();
        if (isAnagram(str1, str2)){
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
    }
    }
}
