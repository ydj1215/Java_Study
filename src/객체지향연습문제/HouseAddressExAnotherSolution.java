package 객체지향연습문제;

// https://www.acmicpc.net/problem/1284
// 배열 풀이

import java.util.Scanner;

public class HouseAddressExAnotherSolution {
    public static void main(String[] args) {
        // 각 숫자가 차지하는 자릿수를 배열로 만들기
        int[] arr = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();

            //탈출 조건
            if (number.equals("0")) break;

            for (int i = 0; i < number.length(); i++) {
                sum += arr[number.charAt(i) - '0'] + 1; // 각 숫자마다 여백이 한칸
            }
            System.out.println(sum+1); // 처음 공백을 더해준다.
            sum = 0; // 다음 계산을 위해 초기화
        }
    }
}
