
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class car extends Vehicle{
    @Override
    void start(){
        System.out.println("car started");
    }
    @Override
    void stop(){
        System.out.println("car stopped");
    }
}
public class AbstractionEx {
    public static void main(String a[]){
        Vehicle v = new car();
        v.start();
        v.stop();
    }
}
