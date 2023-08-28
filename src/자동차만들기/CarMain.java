package 자동차만들기;

import 다형성기본.Parent;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car;
        int distance = 0; // 거리
        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 : [1] 부산, [2] 대전, [3] 강릉, [4] 광주 : ");
        int area = sc.nextInt();
        switch (area) {
            case 1:
                distance = 400;
                break;
            case 2:
                distance = 150;
                break;
            case 3:
                distance = 200;
                break;
            case 4:
                distance = 300;
                break;
        }

        System.out.print("이동할 승객 수 입력 : ");
        int passengerNum = sc.nextInt();
        if (passengerNum > 100 || passengerNum < 1) {
            System.out.println("승객수가 잘못 입력됐습니다!");
            return;
        }

        System.out.print("이동차량을 선택하세요 : [1] 스포츠카, [2] 승용차, [3] 버스 : ");
        int whatCar = sc.nextInt();

        System.out.print("부가 기능 : [1] ON, [2] OFF : ");
        int extraOption = sc.nextInt();

        if (extraOption == 2) { // 부가 기능 x
            switch (whatCar) {
                case 1: // 스포츠
                    if (passengerNum < 2) distance = distance;
                    else {
                        if (passengerNum % 2 == 0) distance = distance / 2 * passengerNum;
                        else distance = distance * (passengerNum / 2 + 1);
                    }
                    //System.out.println(distance);

                    car = new SportCar();
                    car.numberOfMove(passengerNum, 2);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 30);
                    car.costTime(distance, 250);
                    car.costTimeMinute(distance, 250);
                    car.carInfo();
                    break;
                case 2: // 승용차
                    if (passengerNum < 4) distance = distance;
                    else {
                        if (passengerNum % 4 == 0) distance = distance / 4 * passengerNum;
                        else distance = distance * (passengerNum / 5 + 1);
                    }
                    //System.out.println(distance);
                    car = new PassengerCar();
                    car.numberOfMove(passengerNum, 4);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 45);
                    car.costTime(distance, 200);
                    car.costTimeMinute(distance, 200);
                    car.carInfo();
                    break;
                case 3: // 버스
                    if (passengerNum < 20) distance = distance;
                    else {
                        if (passengerNum % 20 == 0) distance = distance / 20 * passengerNum;
                        else distance = distance * (passengerNum / 20 + 1);
                    }
                    //System.out.println(distance);

                    car = new Bus();
                    car.numberOfMove(passengerNum, 20);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 100);
                    car.costTime(distance, 150);
                    car.costTimeMinute(distance, 150);
                    car.carInfo();
                    break;
                default:
                    System.out.println("해당 차량이 존재하지 않습니다.");
            }
        } else {// 부가 기능 적용
            switch (whatCar) {
                case 1: // 스포츠
                    if (passengerNum < 2) distance = distance;
                    else {
                        if (passengerNum % 2 == 0) distance = distance / 2 * passengerNum;
                        else distance = distance * (passengerNum / 2 + 1);
                    }
                    //System.out.println(distance);

                    car = new SportCar();
                    car.numberOfMove(passengerNum, 2);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 30);
                    car.costTime(distance, 300); // 250 -> 300
                    car.costTimeMinute(distance, 300);
                    car.carInfo();
                    break;
                case 2: // 승용차
                    if (passengerNum < 5) distance = distance;
                    else {
                        if (passengerNum % 5 == 0) distance = distance / 5 * passengerNum;
                        else distance = distance * (passengerNum / 5 + 1);
                    }
                    System.out.println(distance);

                    car = new PassengerCar();
                    car.numberOfMove(passengerNum, 5);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 45);
                    car.costTime(distance, 200);
                    car.costTimeMinute(distance, 200);
                    car.carInfo();
                    break;
                case 3: // 버스
                    if (passengerNum < 20) distance = distance;
                    else {
                        if (passengerNum % 20 == 0) distance = distance / 20 * passengerNum;
                        else distance = distance * (passengerNum / 20 + 1);
                    }
                    //System.out.println(distance);

                    car = new Bus();
                    car.numberOfMove(passengerNum, 20);
                    car.movingCost(distance);
                    car.numberOfRefuel(distance, 130);
                    car.costTime(distance, 150);
                    car.costTimeMinute(distance, 150);
                    car.carInfo();
                    break;
                default:
                    System.out.println("해당 차량이 존재하지 않습니다.");
            }
        }
    }
}
