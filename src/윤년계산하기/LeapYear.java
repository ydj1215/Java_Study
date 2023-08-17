package 윤년계산하기;

// 윤년(4년마다 2월 29일이 존재)은 4로 나누어 떨어 진다.
// 100으로 나누어 떨어지면 해당 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요 : ");
        int year = sc.nextInt();

        //100으로 나누어 떨어지지 않거나, 400으로 나누어 떨어지면, 둘중에 하나라도 만족하면 윤년이다.
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println(year + "는 윤년입니다!");
        }
        else
        {
            System.out.println(year + "윤년이 아닙니다!");
        }
    }
}
