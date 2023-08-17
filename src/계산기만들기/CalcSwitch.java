package 계산기만들기;

import java.util.Scanner;

public class CalcSwitch
{
    public static void main(String[] args)
    {
        int x, y; // 좌항, 우항
        char op; // 연산자

        Scanner sc = new Scanner(System.in);
        System.out.print("x 의 값은? : ");
        x = sc.nextInt();
        System.out.print("연산자는? : ");
        op = sc.next().charAt(0);
        System.out.print("y = ");
        y = sc.nextInt();

        switch (op)
        {
            case '+':
                System.out.println(" 덧셈의 결과값 : " + (x+y));
                break;
            case '-':
                System.out.println(" 뺄셈의 결과값 : " + (x-y));
                break;
            case '*':
                System.out.println(" 곱셈의 결과값 : " + (x*y));
                break;
            case '/':
                System.out.println(" 나눗셈의 결과값 : " + ((double)x/y)); // (double)(x/y) 로 하면 X
                break;
            default:
                System.out.println("해당하는 연산자가 존재하지 않습니다!");
        }
    }
}
