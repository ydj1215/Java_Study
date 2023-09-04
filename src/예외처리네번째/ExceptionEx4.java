package 예외처리네번째;

// ArithmeticException : 연산 오류

import java.util.Scanner;

public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try{
                rst = a/b;
            }catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue;
            } finally { // 무조건 실행되는 구문
                System.out.println("결과 : " + rst);
                System.out.println("후후");
            }
        }
    }
}
