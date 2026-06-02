class LLW {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    public static void main(String[] args) {
        LLW llw = new LLW();
        String input = "Hello World   ";
        int result = llw.lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result); // Output: 5
}
}