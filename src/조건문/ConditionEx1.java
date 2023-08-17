package 조건문;

// 조건을 만족하는 경우와, 만족하지 않는 경우로 나누어 수행하는 것

import java.util.Scanner;

public class ConditionEx1
{
    public static void main(String[] args)
    {
            //System.out.print("정수를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
//
//        // if ~ else : 참인 경우와 거짓인 경우를 나누어서 수행
//        if(num > 0)
//        {
//            System.out.println(num + "는 양수 입니다!");
//        }
//        else if(num <0)
//        {
//            System.out.println(num + "는 음수 입니다!");
//        }
//        else System.out.println(num + "0입니다");

        // if~if~if 문은 모든 조건문이 실행되나,
        // if~else if~else if 문 같은 경우에는 가장 먼저 참인 조건문만 실행되고
        // 그 이후의 모든 else if 조건은 검사되지 않는다.

        while(true) {
            System.out.print("문자를 입력하세요 : ");
            char ch = sc.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') //ASCHII a = 97, z = 122
            {
                System.out.println(ch + "는 소문자 알파벳 입니다!");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + "는 대문자 알파벳 입니다!");
            } else {
                System.out.println(ch + "는 알파벳이 아닙니다!");
            }
        }
    }
}
