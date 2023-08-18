package 연습문제;
import java.util.Scanner;

// 문자열 (abcd) 를 입력하면 dcba로 출력하는 문제
// a : 97, b: 96, ... z : 122

public class Question5 {
    public static void main(String[] args) {
        // 풀이_1
//        System.out.println("공백없는 문자열을 입력하세요. : ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String str2 = "";
//
//        for(int i = 0; i<str.length(); i++){
//            str2 += str.substring(str.length()-i-1, str.length()-i);
//        }
//
//        System.out.println(str2);

        // 풀이_2
        System.out.println("공백없는 문자열을 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int pos = input.length() - 1; // 반전된 문자열의 시작 위치
        while (pos > -1) {// 0부터 시작
            System.out.print(input.charAt(pos));
            // charAt()는 문자열에서 특정 인덱스에 위치한 문자를 가져온다.
            // 문자기 때문에 형은 char이다. (파라미터는 0부터시작한다.)
            pos--; // ... 3, 2, 1, 0
        }
    }
}
