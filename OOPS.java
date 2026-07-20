abstract class Vehicle {

    int maxSpeed = 120;
    abstract void display();
}
class Car extends Vehicle {
    int maxSpeed = 180;
    void display() {
        System.out.println("Car maxSpeed: " + maxSpeed);
        System.out.println("Vehicle maxSpeed: " + super.maxSpeed);
    }
}
class Bike extends Vehicle {
    int maxSpeed = 100;
    
    void display() {
        System.out.println("Bike maxSpeed: " + maxSpeed);
        System.out.println("Vehicle maxSpeed: " + super.maxSpeed);
    }
}
class Truck extends Vehicle {
    int maxSpeed = 80;
    void display() {
        System.out.println("Truck maxSpeed: " + maxSpeed);
        System.out.println("Vehicle maxSpeed: " + super.maxSpeed);
    }
}
class ParkingLot{
    Vehicle[] vehicles;
    int capacity;
    int count;

    ParkingLot(int capacity) {
        this.capacity = capacity;
        vehicles = new Vehicle[capacity];
        count = 0;
    }

    void parkVehicle(Vehicle vehicle) {
        if (count < capacity) {
            vehicles[count] = vehicle;
            count++;
            System.out.println("Vehicle parked.");
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    void displayVehicles() {
        for (int i = 0; i < count; i++) {
            vehicles[i].display();
        }
    }   
}
public class OOPS {
    public static void main(String[] args) {
        Vehicle car = new Car();
    }
}
