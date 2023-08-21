package 연습문제;

// 햄버거 3개와 음료 2개의 값을 연속으로 입력 받아,
// 햄버거 중  3개 중 가장 작은값, 음료 2개 중 가장 작은 값을 찾아,
// 두 개를 더해서 세트 메뉴를 만들고 50원을 빼서 금액을 출력하기

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,0,0,0,0};
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 100 || arr[i]>2000) return;
        } // 버거1, 버거2, 버거3 / 음료1, 음료2

        // 내가 한 풀이
        int temp = arr[0];
        
//        for(int m=0; m<3; m++) {
//            if(arr[m]<temp) temp = arr[m];
//            }
//
        
        int temp2 =arr[3];
//        for(int n = 3; n<5; n++){
//            if(arr[n]<temp2) temp2 = arr[n];
//        }

        // 더 간단한 for문 하나로 묶는 풀이
        for(int i = 0; i<arr.length; i++){
            if(i<3 && temp>arr[i]) temp = arr[i];
            if(i>2 && temp2 > arr[i]) temp2 = arr[i];
        }

        int result = temp + temp2 - 50;
        System.out.println(result);
    }
}
