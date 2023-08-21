package 연습문제;

// 대문자는 소문자로, 소문자는 대문자로 바꿔서 출력
// ASCII a = 97, A = 65 둘의 차이는 32이다.
// charAt(index) : 문자열에 해당 인덱스 문자를 추출
// toCharArray() : 문자열을 문자 배열로 변환

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        int index;

        // char 형 끼리의 연산이 가능하다!
        for(index = 0; index<str.length(); index++) {
            char ch = str.charAt(index);
            if(ch < 'a') System.out.println((char)(ch + ('a' - 'A'))); // 대문자
            // (char) 이 없으면 숫자로 찍힌다. ch + 32와 동일하다.
            else System.out.print((char)(ch - ('a' - 'A'))); // 소문자
        }
    }
}
