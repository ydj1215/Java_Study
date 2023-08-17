package 정수나누어담기;

import java.util.Scanner;

// 100의 자리 정수를 입력 받아서 세 개의 변수에 나누어 대입하기
public class ExampleText2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("백의 자리의 정수를 입력하세요 : "); // 236
        int num = sc.nextInt();

        int a = num /100; // 몫 2
        int b = (num % 100)/10; //3
        int c = num % 10; //6

        System.out.println("100의 자리 는? : " + a);
        System.out.println("10의 자리 는? : "+ b);
        System.out.println("1의 자리 는? : "+ c);
    }
}
