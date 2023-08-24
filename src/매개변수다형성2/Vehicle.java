package 매개변수다형성2;

public class Vehicle {
    public void run() {
        System.out.println("Running~");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bus Running~");
    }
}

class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("Sports Car Running~");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("Taxi Running~");
    }
}
