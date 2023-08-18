package 사각형출력;

// input : 3
// Output :
// 1 2 3
// 4 5 6
// 7 8 9

import java.util.Scanner;

public class SquareEx {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= num*num; i++)
        {
            System.out.printf("%-4d", i);
            count ++;

            if(count % num == 0) System.out.println();
        }
    }
}
