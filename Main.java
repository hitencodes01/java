class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

class Driver {
    String name;

    void startDriving(Car car) {
        System.out.println(name + " is driving the car.");
        car.drive();
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Car and a Driver and simulate driving
        Car c = new Car();
        c.brand = "tata";
        c.speed = 80;
        c.drive();
        Driver d = new Driver();
        d.name = "hiten";
        d.startDriving(c);
    }
}

