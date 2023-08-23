package 영화표예매;

// 간단한 영화표 예매 시스템에 대한 예제
// 사용자 극장의 좌석을 선택, 판매는 좌석의 개수만큼 판매 금액을 계산
// 1. 예매하기와 종료하기 메뉴 만들기
// 2. 극장의 좌석은 10개
// 3. 각 좌석당 금액은 12000원

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(12000);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[1] 예매하기");
            System.out.println("[2] 종료하기");
            if (sc.nextInt() == 1) movieTicket.selectSeat();
            else {
                System.out.println("총 판매 금액 : " + movieTicket.total());
                break;
            }
        }
    }
}
