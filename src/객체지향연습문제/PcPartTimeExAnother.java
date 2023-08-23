package 객체지향연습문제;

import java.util.Scanner;

public class PcPartTimeExAnother {
    public static void main(String[] args) {
        int[] arr = new int[100]; // 좌석 상태를 저장할 배열
        int count = 0; // 중복된 좌석 수를 카운트할 변수
        int seatNum; // 입력으로 받은 좌석 번호를 저장할 변수

        Scanner sc = new Scanner(System.in);
        int personNum = sc.nextInt(); // 사용자 수 입력 받기

        for (int i = 0; i < personNum; i++) {
            seatNum = sc.nextInt(); // 좌석 번호 입력 받기

            if (arr[seatNum - 1] == 1) {
                count++; // 이미 사용 중인 좌석이라면 count를 증가시킴
            } else {
                arr[seatNum - 1] = 1; // 빈 좌석이라면 사용 중으로 표시
            }
            // 실제 좌석은 0번부터가 아니라 1번부터 시작이므로 -1 을 적용
        }

        System.out.println(count); // 중복된 좌석의 수 출력
    }
}
