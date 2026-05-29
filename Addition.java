public class Addition {// non static method to add two numbers
    public int addTwoNumbers(int a, int b, int c) {
        return a+b+c;
    }// static method to change the value of x0    
    static void change (int x){
        x=500;
        System.out.println("value of x inside change method: "+x);
    }
    //the above method will not change the value of x in main method because it is a primitive data type and it is passed by value, 
    //so a copy of x is created in the change method and any changes made to x in the change method will not affect the original value of x in the main method.
    public static void main(String[] args) {
        int y = 5;
        change(y);
        System.out.println("value of y before change method: "+y);
        Addition a=new Addition();
        System.out.println(a.addTwoNumbers(11, 22, 33));
    }
    
}
