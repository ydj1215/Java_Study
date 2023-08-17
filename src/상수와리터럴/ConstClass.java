package 상수와리터럴;
import java.util.Scanner; // 스캐너를 사용하기 위해 import 한 클래스

// 상수 : 변수와 마찬가지로 메모리에 저장할 공간을 확보하는 것
// 단 한번만 값의 지정이 가능
// 값을 한번 쓰고 나면 readOnly 상태가 된다.
// final 키워드를 사용
public class ConstClass
{
    final static String KH_DOMAIN = "http://192.167.12.13";
    final static String PORT_NUM = "8080";

    public static void main(String[] args)
    {
        final int AGE; // 상수는 관례적으로 대문자
        AGE = 30; // 자바에서의 상수는 C, C++ 에서와는 다르게 선언과 초기화가 따로 가능하다.

        final double TAX_RATE = 0.1; // 세율값을 고정

        /*
        Scanner sc = new Scanner(System.in); // 표준 입력을 받기 위해 사용
        System.out.println("수입을 입력하세요 : ");
        int income = sc.nextInt(); // System.in, nextInt() : 사용자로부터 정수를 입력받는 Scanner의 메서드
        System.out.println("당신이 내야 할 세금은 " + income * TAX_RATE + "입니다.");
    */

        System.out.println(KH_DOMAIN);
        System.out.println(PORT_NUM);
    }
}
