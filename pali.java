import java.util.Scanner;
public class pali {
    public static boolean isPalindrome(String s){

        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;    
    }
    public static void main(String[] args) {
        System.out.println("enter a string:");
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (!isPalindrome(str)) {
            System.out.println("Not Palindrome");
        }
        
    }
}
