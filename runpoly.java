class vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends vehicle{
    void start(){
        System.out.println("Car is starting");
    }
}
class Bike extends vehicle{
    void start(){
        System.out.println("Bike is starting");
    }
}
class bus extends vehicle{
    void start(){
        System.out.println("Bus is starting");
    }
}
    public class runpoly {
    public static void main(String[] args){
        Car car = new Car();
        car.start();
        Bike bike = new Bike();
        bike.start();
        bus bus = new bus();
        bus.start();
    }
}