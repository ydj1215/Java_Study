package 연습문제;

import java.util.Scanner;

// 아스키 코드 값을 이용해서 풀이

public class Question4AnotherSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += num.charAt(i) - '0'; // 3의 아스키 코드값은 51, 4는 52...
        }
    }
}
