public class reversestring {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        reversestring rs = new reversestring();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        rs.reverseString(s);
        System.out.println(s); // Output: olleh
    }
}