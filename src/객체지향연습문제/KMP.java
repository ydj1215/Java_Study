package 객체지향연습문제;

//https://www.acmicpc.net/problem/2902

import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 한줄로 입력

        // 대문자 -> 소문자 ( a > A ), A 에 a-A 를 더하면 a가 된다.
        // a 에서 a-A를 빼면 A가 된다.
        // 첫글자 변환
        char first = input.charAt(0);
        first = (char)(first + ('a'-'A'));
        System.out.print((char)(first -('a'-'A')));

        // - 뒤 문자 변환
        for(int i = 1; i<input.length(); i++) {
            if (input.charAt(i) == '-') {
                int second = input.charAt(i + 1);
                second = (char) (second + ('a' - 'A'));
                System.out.print((char) (second -('a'-'A')));
            }
        }
        
        // 간략한 또 다른 풀이
        System.out.println();
        System.out.println("-".repeat(20));
        System.out.println();

        for(int i = 0; i<input.length(); i++){
            if(i == 0) System.out.print(input.charAt(i));
            else{
                if(input.charAt(i) == '-') System.out.print(input.charAt(i+1));
            }
        }
    }
}
