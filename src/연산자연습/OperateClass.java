package 연산자연습;

// 산술 연산자 : 사칙 연산(+, -, *, /) 와 나머지 연산자(%)

import java.util.Scanner;

public class OperateClass
{
    public static void main(String[] args)
    {
//        try {
//            int num1 = 10, num2 = 4;
//            System.out.println("덧셈 :" + (num1 + num2));
//            System.out.println("뺄셈 :" + (num1 - num2));
//            System.out.println("곱셈 :" + (num1 * num2));
//            System.out.println("나눗셈 :" + ((double) num1 / num2));
//            System.out.println("나머지 :" + (num1 % num2));
//            System.out.println("몫 :" + (num1 / num2));
//        }
//        catch(ArithmeticException e) {
//            System.out.println("0으로 나눌 수는 없습니다.");
//        }

//        // 대입 연산자 : 변수에 값을 대입하는 연산자 ( = )
//        // 프로그램에서 = 는 같다라는 의미 X, 값을 대입한다는 의미
//        int num1 = 10, num2 = 4;
//        System.out.println(num1 += 2); // 복합 대입 연산자 : num1 = num1 + 2;
//       /* int num3;
//        System.out.println(num3); // 자바에서는 쓰레기 값이 들어가지 않고 오류 발생. */
//        System.out.println(num1 -= 2);
//        System.out.println(num1 *= 2);
//        System.out.println(num1 /= 2);
//        System.out.println(num1 %= 2);
//        System.out.println("num1 = " + num1);
//
//        // 증감 연산자 : 단항 연산자, 피 연산자의 값을 1 증가 / 감소
//        System.out.println(++num1); // 먼저 증가 시킨후 대입
//        System.out.println(num1++); // 대입 시킨 후 증가
//        System.out.println("num1 = " + num1);
//
//        int tmp = num1 ++;
//        System.out.println(tmp);
//        System.out.println(num1);
        
        // 비교 연산자 : 두 개의 피연산자를 비교해서 어느쪽이 더 큰지를 판별
        int x =  10;
        int y = 20;
        boolean rst1, rst2, rst3;

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        // 논리 연산자 : &&(AND 연산자 : 둘다 참인 경우 참)
        // || (OR 연산자, 둘중 하나만 참이여도 참)
        // ! : NOT 연산자, 현재가 참이면 거짓, 거짓이면 참
        System.out.println("===== 논리 연산자 =====");

        rst1 = (x>0) && (x>y); //참 and 거짓
        rst2 = (x>0) || (x>y); // 참 or 거짓
        rst3 = !((x>0) || (x<y)); // ! (참 or 참)

        System.out.println("rst1: " + rst1);
        System.out.println("rst2: " + rst2);
        System.out.println("rst3: " + rst3);

        // 삼항 연산자 : 3개의 피연산자를 필요로 하는 연산자?
        System.out.println("===== 삼항 연산자 =====");
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        boolean isAdult  = (age > 19) ? true : false;
        System.out.println(isAdult);
        
        // 문자열 결합 연산자
        System.out.println("Java" + 18.04 + 12);
        System.out.println(3 + 3.3 + "JDK"); //6.3JDK

        // 연산자 우선 순위 확인
        int val1 = 5;
        int val2 = 6;
        int val3 = 7;
        int result1, result2, result3, result4;
        result1 = val1 + val2 * val3;
        result2 = (val1 + val2) * val3;
        result3 = val1 + (++val2) * val3;
        //result4 = val1 +++val2 * val3;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        //System.out.println(result4);
    }
}
