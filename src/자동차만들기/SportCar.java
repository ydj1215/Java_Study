package 자동차만들기;


public class SportCar implements Car {
    int passengerNum = 0;
    int movingCost = 0;
    int numberOfRefuel = 0;
    double costTime = 0;
    double costTimeMinute = 0;

    // 이동 횟수 구하기
    @Override
    public int numberOfMove(int passengerNum, int seatNum) {
        // 21 / 2 -> 11
        if (passengerNum % seatNum == 0) this.passengerNum = passengerNum / seatNum;
        else this.passengerNum = passengerNum / seatNum + 1;
        return this.passengerNum;
    }

    // 총 이동 비용
    @Override
    public int movingCost(int distance) {
        // 4400 / 8 * 2000
        this.movingCost = distance / 8 * 2000;

        return this.movingCost;
    }

    // 총 주유 횟수
    @Override
    public int numberOfRefuel(int distance, int tankSize) {
        // (4400/8 = )550 / 30 = 18.33 -> 19회
        if ((distance / 8) % tankSize == 0) this.numberOfRefuel = (distance / 8) / tankSize;
        else this.numberOfRefuel = (distance / 8) / tankSize + 1;

        return this.numberOfRefuel;
    }

    // 소요 시간
    @Override
    public double costTime(int distance, int speed) {
        //4400 / 250 = 17.6 (나머지는 150)
        this.costTime = (double) distance / speed;
        return this.costTime;
    }

    @Override
    public double costTimeMinute(int distance, int speed) {
        // costTime에서 distance/speed를 뺀 뒤, 올림한 후 분 단위로 변환
        int time_1 = distance / speed; //17
        double time_2 = (double) distance / speed; // 17.6666
        double time_3 = time_2 - time_1;
        double time_4 = Math.ceil(time_3 * 60); // 올림
        this.costTimeMinute = time_4;
        return this.costTimeMinute;
    }

    @Override
    public void carInfo() {
        System.out.println("===== Ferrari =====");
        System.out.println("총 비용 : " + movingCost + "원");
        System.out.println("총 주유 횟수 : " + numberOfRefuel + "회");
        System.out.print("총 이동 시간 : " + (int) costTime + "시간 ");
        System.out.println((int) costTimeMinute + "분");
    }
}
