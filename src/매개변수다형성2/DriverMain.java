package 매개변수다형성2;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("Andrew's ");
        Bus bus = new Bus();
        SportsCar sportsCar = new SportsCar();
        Taxi taxi = new Taxi();

        Scanner sc = new Scanner(System.in);
        System.out.print("Select the Car : [1] 버스, [2] 스포츠카, [3] 택시 : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                driver.drive(bus);
                break;
            case 2:
                driver.drive(sportsCar);
                break;
            case 3:
                driver.drive(taxi);
                break;
            default:
                System.out.println("No Car!");
        }
    }
}
