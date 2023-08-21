package 커맨드라인;

// main 함수는 자바 프로그램의 시작 지점이다.
// CLI( Command Line Interface) : 입력
// 외부 실행 파일을 통해서 자바 코드를 실행할 때 사용한다.
// 외부 터미널 모드에서 입력을 받는다.

// Run - Your Configuration Name 의 Prgram arguments 에 (arg2[0]) 10, (arg[1[) 20 값을 각각 입력
public class CommandLineEx {
    public static void main(String[] args) {
        String sr = "Hello";
        if(args.length != 2 ) {
            System.out.println("프로그램 사용법");
            System.out.println("Java Main String Argument num1 num2");
            System.exit(0); // 프로그램 강제 종료 (시스템 콜)
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1= Integer.parseInt(strNum1);
        int num2= Integer.parseInt(strNum2);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result); // 10 + 20 = 30

        }
    }
