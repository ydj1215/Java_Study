package 객체지향연습문제;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 입력
        int num = sc.nextInt();
        if(num<0 || num>99) return;

        // 숫자가 10보다 작은 경우
        if(num<10) num = num *10;

        //계산
        int count = 0;
        int result = 0;
        int temp = num;
        while(true){
            result = Calc(num);
            count ++;
            num = result;
            if(result == temp) break;
        }

        System.out.println(count);
    }

    // 계산 함수
    static int Calc(int num){
        int a = num/10 + num%10;
        return (num%10)*10 + a%10;
    }
}
