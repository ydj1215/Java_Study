package 별찍기연습;

// 삼각형 별찍기
// 입력 받은 수만큼 별찍기
// 5를 입력하면
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {

        System.out.println("별의 개수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 정방향
        for(int i = 0; i<num; i++){
            for(int j =0; j<i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 역방향
        for(int i = num; i>0; i--){
            for(int j =0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
