package 자동차만들기종합;

import 다형성기본.Parent;

public class PassengerCar extends Car{
    // 생성자
    public PassengerCar(String name){
        this.name = name;
        this.maxSpeed = 200;
        fuelEff = 12;
        fuelTank = 45;
        seatCnt = 4;
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt ++;
    }
}
