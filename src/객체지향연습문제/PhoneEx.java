package 객체지향연습문제;

// https://www.acmicpc.net/problem/1267

import java.util.Scanner;

public class PhoneEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 통화의 개수 입력
        int n = sc.nextInt();
        if(n<0 || n>21) return;
        int[] arr = new int[n];

        // 통화 시간 입력
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0 || arr[i]>10000) return;
        }

        int ySum = 0;
        int mSum = 0;

        for(int i = 0; i<n; i++){
           ySum += yCalc(arr[i]);
           mSum += mCalc(arr[i]);
        }

        if(ySum > mSum){
            System.out.println("M " + mSum);
        }
        else if(ySum == mSum) System.out.println("Y M " + mSum);
        else System.out.println("Y " + ySum);
    }

    // 영식 요금제 계산
    static int yCalc(int time){
        if(time<30) return 10;
        else {
            int a = time / 30+1;
            return a * 10;
        }
    }

    //민식 요금제 계산
    static int mCalc(int time){
        if(time<60) return 15;
        else{
            int a = time/60+1;
            return a*15;
        }
    }
}
