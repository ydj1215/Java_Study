package 객체지향연습문제;

// https://www.acmicpc.net/problem/1453

import java.util.Scanner;

public class PcPartTimeEx {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int[] temp = new int[n];
        for (int i = 0; i < 100; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {  // j의 범위 수정
                if (arr[i] == arr[j]) {     // arr[i - j] -> arr[j]로 수정
                    temp[j] = 1;            // 인덱스 j에 중복 표시
//                    System.out.print("arr[" + i + "] = " + arr[i] + " ");
//                    System.out.print(" / ");
//                    System.out.print("arr[" + j + "] = " + arr[j] + " \n");
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (temp[i] == 1) count++;
        }
        System.out.println(count);
    }
}
