package 자동차만들기종합;

// 상속을 주기 위한 클래스
public abstract class Car {
    // protected 접근제한자는 같은 패키지와 상속 관계에서 접근 가능
    protected int maxSpeed; // 최고 속도
    protected int fuelEff; // 연비 (리터 당 주행거리)
    protected int seatCnt; // 좌석수
    protected String name; // 자동차 이름
    protected int fuelTank; // 연료 탱크 크기

    public String getName() {
        return name;
    }

    abstract void setMode(boolean isMode); // 상속 받은 각각의 자동차의 특수 기능

    // 총 이동 횟수
    int getMovingCnt(int passCnt) { // 승객 숫자 입력
        if (passCnt % seatCnt != 0) return (passCnt / seatCnt) + 1;
        return passCnt / seatCnt;
    }

    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) { // 매개 변수 = 이동 거리, 이동 횟수
        if (((dist * moveCnt) / fuelEff) % fuelEff != 0) return (((dist * moveCnt) / fuelEff) / fuelEff) + 1;
        return ((dist * moveCnt) / fuelEff) / fuelTank;
    }

    // 총 이동 비용
    int getTotalCost(int dist, int moveCnt) {
        // double disCost = (double) dist / fuelEff * 2000;
        // return (int)(disCost * moveCnt);
        return dist / fuelEff * 2000 * moveCnt;
    }

    // 총 소요 시간
    String getMovingTime(int dist, int moveCnt) {
        double getTime = (double) dist * moveCnt / maxSpeed;
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60; // 시
        int minute = totalMinute % 60; // 분
        return String.format("%d시간 %d분", hour, minute);
    }
}
