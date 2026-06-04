class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is starting");
    }
}
public class overridetask {
    public static void main(String[] args){
        car car = new car();
        car.start();
    }
}
