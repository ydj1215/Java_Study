package 시스템출력;

import java.util.Scanner;

// System.out : 표준 출력 스트림
// print, println : 오버로딩이 적용된 메소드이며 줄바꿈 차이만 존재.

public class SystemOut
{
    public static void main(String[] args)
    {
        String name  = "곰돌이사육사";
        String addr = "수원시";
        int age = 22;

//        double pi = 3.141591;
//
//        System.out.println(age);
//        System.out.println(name); // 알아서 오버로딩이 된다.
//
//        // 오버로딩이 없는 형태 (속도가 빠르다.)
//        System.out.printf("%s\n", name); // 형을 지정해줘야 한다.
//
//        System.out.println(pi);
//        System.out.printf("%.2f\n", pi); // 소수점 두번째 자리까지만 출력하고 싶을 때

        char gender = 'M';
        int kor = 99, eng = 88, mat = 40;

        // 자바 방식 : 오버로딩
        System.out.print("====== Java Style ======\n");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + kor + eng + mat); // 앞에 온 것의 형에 따라서 뒤의 형이 결정
        System.out.println(kor + eng + mat);
        // 연산자 우선 순위를 괄호를 통해 변경해 먼저 덧셈을 수행, 그 후에 문자열과 이후 붙인다.
        System.out.println("총점 : " + (kor + eng + mat));
        //연산자 우선 순위가 덧셈보다 나눗셈이 높아서 괄호를 통해 순서를 변경해야 한다.
        System.out.println("평균: " + ((double)(kor + eng + mat) / 3)); // 연산
        System.out.println("평균: " + ((kor + eng + mat) / 3.0)); // 묵시적 형 변환

        // C언어 스타일 : 서식을 지정하는 스타일
        // 서식 지정자 : %d (정수), %ld (long 타입의 정수) , %u (부호 없는 정수형)
        // %s (문자열), %f (실수), %c(문자) 등이 존재
        // 이스케이프 시퀸스 : \n(줄바꿈), \r(캐리지 리턴), \b(백스페이스), \t(tab)
        // 일반적으로 줄이 바뀌면 캐리지 리턴도 같이 일어난다.
        // 캐리지 리턴이란 커서를 맨 앞, 즉 처음으로 되돌리는 것을 의미.
        System.out.printf("이름 : %s\n", name);
        System.out.printf("오늘의 습도는 %.2f%% 입니다.", 85.555555); //'%' 가 찍고싶다면 한개를 더 써줘야한다.
        System.out.printf("성별 : %c\n", gender); // 문자 출력
        System.out.println("안녕하세요. 저의 이름은 \"유동재\" 입니다.");
        System.out.printf("평균 : %.2f\n", ((kor + eng + mat) / 3.0));

        System.out.printf("Apple\rBanana\tOrange\b\b\n"); // 커서가 앞으로 가서 앞의 문자를 덮어 쓴다.
        System.out.printf("|%-6d|%-6d|%-6d\n", 100, 2000, 30000); // %6d : 줄맞춤, - : 왼쪽 정렬

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n * n; i++)
        {
            System.out.printf("%4d", i);
            if(i%n == 0) System.out.println(); // n의 배수마다 줄바꿈
        }
    }
}
