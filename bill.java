import java.util.List;

public class bill {
        public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int total = 0;
    for (int i = 0; i < bill.size(); i++) {
        if (i != k) {
            total += bill.get(i);
        }
    }
    
    // Anna's fair share is half of the shared items
    int annaShare = total / 2;
    
    // Check if Brian overcharged her
    if (b == annaShare) {
        System.out.println("Bon Appetit");
    } else {
        System.out.println(b - annaShare);
    }
    }
    
}
