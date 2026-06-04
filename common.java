import java.util.HashSet;
import java.util.Set;

public class common {
    public static void main(String[] args) {
        Set<Character> s = new HashSet<>();

        String arr = "banana";
        for (int i = 0; i < arr.length()-1; i++) {
            char ch = arr.charAt(i);
            if (s.contains(ch)) {
                System.out.println(ch);
                
                
            }
            s.add(ch);
            
        }
    }
}