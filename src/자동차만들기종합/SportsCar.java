package 자동차만들기종합;

public class SportsCar extends Car{
    // 생성자
    public SportsCar(String name){
        this.name = name;
        this.maxSpeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) this.maxSpeed *= 1.2;
    }
}
