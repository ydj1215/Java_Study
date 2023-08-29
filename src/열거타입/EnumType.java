package 열거타입;

// 서로 연관된 상수들을 모아 놓는것
// 실제 값 뿐만 아니라 타입까지 체크 가능
// 예전에 class 내의 final Static String... 정의해서 사용하던 방식 대체 가능

import java.util.Calendar;

public class EnumType {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 실제 오늘 요일 가져오기
        switch (week) {
            case 1:
                today = Week.MON; // 열거 타입이외의 데이터를 넣어려고 하면 오류 발생
                break;
            case 2:
                today = Week.TUE;
                break;
            case 3:
                today = Week.WEN;
                break;
            case 4:
                today = Week.THR;
                break;
            case 5:
                today = Week.FRI;
                break;
            case 6:
                today = Week.SAT;
                break;
            case 7:
                today = Week.SUN;
                break;
        }
        System.out.println("오늘 요일은 " + today);
    }
}

enum Week {MON, TUE, WEN, THR, FRI, SAT, SUN};
