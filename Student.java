class Student {
    String name;
    int age;
    Student(){
        name="default";
        age=0;
    }
    //patametrized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //constructor overloading
    Student(String name){
        this.name = name;
        this.age = 0;
    }
    void display(){
        System.out.println("name: " + name + ", age: " + age);
    }
    public class obj {}
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "jerry";
        s1.age = 20;
        s1.display();
    }
}