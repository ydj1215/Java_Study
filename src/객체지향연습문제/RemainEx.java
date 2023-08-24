package 객체지향연습문제;

// https://www.acmicpc.net/problem/3052

import java.util.Arrays;
import java.util.Scanner;

public class RemainEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // 입력
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] <0 || arr[i]>1000) return;
        }


        // 출력
        int[] rrr = new int[100];
        for(int i = 0; i<10; i++){
            rrr[arr[i] %42] = 1;
        }

        int count = 0;
        for(int i = 0; i<rrr.length; i++){
            if(rrr[i] ==1) count ++;
        }

        System.out.println(count);
    }
}
