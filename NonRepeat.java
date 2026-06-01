public class NonRepeat {
    public static char findFirstNonRepeated(String s) 
    {
        for (int i =0;i<s.length();i++)
        {
            int count =0;
            for (int j=0;j<s.length()-2;j++)
            {
                if (s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if (count == 1) 
            {
            return s.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeated("aabbcdd"));
    }
}
