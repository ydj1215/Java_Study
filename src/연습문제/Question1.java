package 연습문제;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("시험 성적을 입력해주세요 : ");
            int score = sc.nextInt();

            if (score > 100 || score < 0) {
                System.out.println("성적을 다시 입력해주세요!");
                continue; // 이번 while 문 주기를 탈출해서 다음 while 주기로 이동
            }
            if (score >= 90 && score <= 100) {
                System.out.println(score + "는 A 입니다!");
                break;
            } else if (score >= 80 && score <= 89) {
                System.out.println(score + "는 B 입니다!");
                break;
            } else if (score >= 70 && score <= 79) {
                System.out.println(score + "는 C 입니다!");
                break;
            } else if (score >= 60 && score <= 69) {
                System.out.println(score + "는 D 입니다!");
                break;
            } else if (score >= 0 && score <= 59) {
                System.out.println(score + "는 F입니다!");
                break;
            } else {
                System.out.println("성적을 다시 입력해주세요!");
                break;
            }
        }
    }
}
