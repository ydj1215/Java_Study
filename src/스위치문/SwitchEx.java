package 스위치문;

// 조건에 조건식이 오지 않고, 조건의 값이 오는 조건문
// 조건의 값에는 정수, 문자, 문자열이 올 수 있다.
// 실수는 명확한 값이 아니라 근사값이기 때문에 올 수 없다.
// C와 C++는 조건식에 문자열이 올 수 없다.
// 장점은 if 문에 비해 가독성이 좋으며, 성능이 살짝 더 빠르다.
// 단점은 조건식이나 범위가 올 수 없다.

import java.util.Scanner;

public class SwitchEx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next();

        switch (season)
        {
            case "spring":
                System.out.println("지금은 봄~");
                break;
            case "summer":
                System.out.println("지금은 여름~");
                break;
            case "autumn":
            case "fall":
                System.out.println("지금은 가을~");
                break;
            case "winter":
                System.out.println("지금은 겨울~");
                break;
            default:
                System.out.println("계절을 입력해주세요^^~");
        }
    }
}
