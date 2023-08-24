package 객체지향연습문제;

// https://www.acmicpc.net/problem/1284

import java.util.Scanner;

public class HouseAddressEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int num = sc.nextInt(); // 5611
            if(num == 0) return;
            if (num > 9999 || num < 1) return;

            int count = 0;

            if (num >= 1000) { // 네자릿수
                count = 5;
                if (num / 1000 == 1) count += 2;
                else count += 3;

                if ((num % 1000) / 100 == 1) count += 2;
                else if ((num % 1000) / 100 == 0) count += 4;
                else count += 3;

                if ((num % 100) / 10 == 1) count += 2;
                else if ((num % 100 / 10) == 0) count += 4;
                else count += 3;

                if (num % 10 == 1) count += 2;
                else if (num % 10 == 0) count += 4;
                else count += 3;
            } else if (num >= 100) { //세자릿수
                count = 4;
                if ((num % 1000) / 100 == 1) count += 2;
                else count += 3;

                if ((num % 100) / 10 == 1) count += 2;
                else if ((num % 100 / 10) == 0) count += 4;
                else count += 3;

                if (num % 10 == 1) count += 2;
                else if (num % 10 == 0) count += 4;
                else count += 3;
            } else if (num >= 10) { // 두자릿수
                count = 3;
                if ((num % 100) / 10 == 1) count += 2;
                else count += 3;

                if (num % 10 == 1) count += 2;
                else if (num % 10 == 0) count += 4;
                else count += 3;
            } else {// 한자릿수
                count = 2;
                if (num % 10 == 1) count += 2;
                else count += 3;
            }

            System.out.println(count);
        }
    }
}
