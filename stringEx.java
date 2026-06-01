public class stringEx {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1=s1.concat("world");
        System.out.println(s1);
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");
        System.out.println(sb.toString());
        //System.out.println(sb.charAt(6));
        //System.out.println(sb.reverse());
        //String c="99";
        //System.out.println(c.equals("99"));
        String a = "hello";
        @SuppressWarnings("RedundantStringConstructorCall")
        String b = new String("Hello");
        System.out.println(a.equals(b));
        for (int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
        for (char c : a.toCharArray()) {
            System.out.println(c+" ");
        }
    }
}
