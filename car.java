public class car {
    String brand;
    String model;
    int speed;
    String color;
    double price;
    public void display(){
        System.out.println("brand: " + brand + ", model: " + model + ", speed: " + speed + ", color: " + color + ", price: " + price);
    }
    public class obj {}
    public static void main(String[] args){
        car c1 = new car();
        c1.brand = "Toyota";
        c1.model = "Camry";
        c1.speed = 120;
        c1.color = "blue";
        c1.price = 25000.0;
        c1.display();
    }
}