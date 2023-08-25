package 디폴트메서드;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("제품 선택 [1] Audio, [2] TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;

        if (sel == 1) {
            rc = new Audio();
            rc.turnON();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
            ((Audio) rc).getInfo(); // RemoteControl rc 이기 때문에,
            // Audio 클래스에 있는 getInfo() 를 사용하기 위해선 형변환을 한번 더 해줘야한다.
            // 그렇다고 Audio rc= new Audio() 로 객체화를 한다면 공통 만능 리모콘(인터페이스) 의 장점이 퇴색되어 버린다.
        } else {
            rc = new Television();
            rc.turnON();
            rc.setVolume(30);
            ((Television) rc).getInfo();
        }
    }

}
