class Calculator{
    public int add (int a, int b){
        return a+b;
    }
    //method overloading
    public int add (int a, int b, int  c){
        return a+b+c;
    }
}
public class polymorphismEx {
    public static void main(String[] args){
        Calculator calc = new Calculator(); // object
        System.out.println(calc.add(11,22));
        System.out.println(calc.add(22,33,44));
    }
}
