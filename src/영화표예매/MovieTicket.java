package 영화표예매;

// 간단한 영화표 예매 시스템에 대한 예제
// 사용자 극장의 좌석을 선택, 판매는 좌석의 개수만큼 판매 금액을 계산
// 1. 예매하기와 종료하기 메뉴 만들기
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12000원

import java.util.Scanner;

public class MovieTicket {
    // 좌석의 개수
    int[] seat = new int[10]; // 인스턴스 필드
    int ticketPrice = 0;

    // 생성자
    public MovieTicket(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // 판매된 좌석의 개수를 확인 후 총 판매 금액을 구해서 반환
    int total() {
        int count = 0;
        for (int val : seat) {
            if (val == 1) count++; // val = 1 이면 판매된 좌석이라는 뜻
        } // seat[va1] == 1 이라는 뜻
        return count * ticketPrice;
    }

    // 선택 가능한 좌석의 리스트를 출력
    void printSeat() {
        for (int j : seat) {
            if (j == 0) System.out.print("[ ] "); // 판매가 안된 좌석
            else System.out.print("[V] "); // 이미 판매가 된 좌석을 의미
        }
        System.out.println();
    }

    // 좌석을 판매하는 메뉴
    void selectSeat() {
        printSeat(); // 좌석 상태 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석을 선택하세요 : ");
        int selSeat = sc.nextInt(); // 유저가 선택한 좌석을 입력 받는다.
        if (seat[selSeat - 1] == 0) { // 배열은 0부터 시작, 사용자는 1부터 선택
            seat[selSeat - 1] = 1; // 판매가 안된 좌석을 판매
            printSeat(); // 판매 이후에 좌석 상태를 다시 출력
        } else {
            System.out.println("이미 판매된 좌석입니다! 다른 좌석을 선택해주세요!");
        }
    }

}
