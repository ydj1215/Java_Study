package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirconMain {
    public static void main(String[] args) throws InterruptedException {
        Aircon lgAircon = new Aircon();
        int elapsedTime = 0; // 경과 시간
        boolean isSetTemp = false; // 온도를 변경할 조건인지 판단

        Scanner sc = new Scanner(System.in);
        System.out.println("에어컨을 켜시겠습니까? (yes / no)");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
            lgAircon.setPower(true); // 에어컨을 킨다.
            lgAircon.setAirconState(); // 온도 설정
            while (true) {
                sleep(1000);
                elapsedTime++;
                switch (lgAircon.getWindStep()) {
                    case 1: // 1단
                        if (elapsedTime >= 60) isSetTemp = true;
                        break;
                    case 2:
                        if (elapsedTime >= 30) isSetTemp = true;
                        break;
                    case 3:
                        if (elapsedTime >= 20) isSetTemp = true;
                        break;
                    default:
                        if (elapsedTime >= 61) isSetTemp = true;
                }
                if (isSetTemp) {
                    if (lgAircon.isHeater()) {//히터가 동작중이면
                        lgAircon.setCurrTemp(1);
                    }
                    if (lgAircon.isCooler()) {
                        lgAircon.setCurrTemp(-1);
                        lgAircon.airConInfo();
                        isSetTemp = false; // 온도 변경 이후 초기화
                        elapsedTime = 0; // 온도 변경 이후 초기화
                    }
                    if(lgAircon.getCurrTemp() == lgAircon.getSetTemp()){
                        // 현재 온도 = 설정 온도
                        System.out.println("에어컨을 종료합니다.");
                        break;
                    }
                }
            }
        }
    }
}