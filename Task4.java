class Vehicle{
    public void move(){
        System.out.println("the vehicle is moving");
    }
}
class Car extends Vehicle{
    public void move(){
        System.out.println("the car is moving fast");
    }
}
public class Task4 {
    public static void main(String[] args) {
        Vehicle v =new Vehicle();
        v.move();
        Car c = new Car();
        c.move();
    }
}
