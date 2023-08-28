package 자동차만들기;

// https://www.notion.so/484b69e3ccc14c498f6d4bdb831b4b4a

public interface Car {
    // 이동 횟수 구하는 메서드
    int numberOfMove(int passengerNum, int seatNum);

    // 총 이동 비용
    int movingCost(int distance);

    // 총 주유 횟수
    int numberOfRefuel(int distance, int tankSize);

    // 소요 시간
    double costTime(int distance, int speed); // 시

    double costTimeMinute(int distance, int speed); // 분

    // 정보 출력
    void carInfo();
}




